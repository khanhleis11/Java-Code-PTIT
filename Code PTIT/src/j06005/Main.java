package j06005;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        
        ArrayList<KhachHang> arr1 = new ArrayList<>();
        ArrayList<MatHang> arr2 = new ArrayList<>();
        ArrayList<HoaDon> arr3 = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            KhachHang x = new KhachHang(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr1.add(x);
        }
        
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            MatHang x = new MatHang(i + 1, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            arr2.add(x);
        }
        
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            HoaDon x = new HoaDon(i + 1, Integer.parseInt(tmp[2]));
            for (KhachHang kh : arr1) {
                if (kh.getIdKH().equals(tmp[0])) {
                    x.setKh(kh);
                }
            }
            for (MatHang mh : arr2) {
                if (mh.getIdMH().equals(tmp[1])) {
                    x.setMh(mh);
                }
            }
            arr3.add(x);
        }
        for (HoaDon x : arr3) {
            System.out.println(x);
        }
    }
}
