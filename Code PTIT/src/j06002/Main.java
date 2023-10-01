package j06002;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> arr1 = new ArrayList<>();
        ArrayList<HoaDon> arr2 = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            SanPham x = new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            arr1.add(x);
        }
        
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] token = s.split("\\s+");
            HoaDon x = new HoaDon(token[0], Integer.valueOf(token[1]));
            for (SanPham sp : arr1) {
                if (sp.getIdSP().equals(token[0].substring(0, 2))) {
                    x.setSp(sp);
                }
            }
            arr2.add(x);
        }
        Collections.sort(arr2);
        for (HoaDon x : arr2) {
            System.out.println(x);
        }
    }
}
