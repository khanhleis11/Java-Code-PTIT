package j07020;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KH.in"));
        int n = Integer.parseInt(sc.nextLine());
        
        ArrayList<KhachHang> arr1 = new ArrayList<>();
        ArrayList<MatHang> arr2 = new ArrayList<>();
        ArrayList<HoaDon> arr3 = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            KhachHang x = new KhachHang(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr1.add(x);
        }
        
        sc = new Scanner(new File("MH.in"));
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            MatHang x = new MatHang(i + 1, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            arr2.add(x);
        }
        
        sc = new Scanner(new File("HD.in"));
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] arr = s.split("\\s+");
            String maKH = arr[0];
            String maMH = arr[1];
            HoaDon x = new HoaDon(i + 1, maKH, maMH, Integer.valueOf(arr[2]));
            
            for (KhachHang kh : arr1) {
                if (kh.getIdKH().equals(maKH)) {
                    x.setKh(kh);
                }
            }
            
            for (MatHang mh : arr2) {
                if (mh.getIdMH().equals(maMH)) {
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
