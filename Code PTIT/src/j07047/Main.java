package j07047;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = Integer.parseInt(sc.nextLine());
        
        ArrayList<LoaiPhong> arr1 = new ArrayList<>();
        ArrayList<KhachHang> arr2 = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            LoaiPhong x = new LoaiPhong(tmp[0], tmp[1], Integer.parseInt(tmp[2]), Double.parseDouble(tmp[3]));
            arr1.add(x);
        }
        
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine(), ma = sc.nextLine();
            KhachHang x = new KhachHang(i + 1, ten, ma, sc.nextLine(), sc.nextLine());
            String loai = ma.substring(2, 3);
            for (LoaiPhong lp : arr1) {
                if (lp.getIdLP().equals(loai)) {
                    x.setLp(lp);
                }
            }
            arr2.add(x);
        }
        Collections.sort(arr2);
        for (KhachHang x : arr2) {
            System.out.println(x);
        }
    }
}
