package j07049;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        
        ArrayList<SanPham> arr1 = new ArrayList<>();
        ArrayList<KhachHang> arr2 = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            SanPham x = new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            arr1.add(x);
        }
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String x1 = sc.nextLine(), x2 = sc.nextLine(), x3 = sc.nextLine(),
                    x4 = sc.nextLine(), x5 = sc.nextLine();
            KhachHang x = new KhachHang(i + 1, x1, x2, Integer.parseInt(x4), x5);
            for (SanPham sp : arr1) {
                if (sp.getIdSP().equals(x3)) {
                    x.setSp(sp);
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
