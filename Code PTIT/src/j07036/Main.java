package j07036;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        
        ArrayList<SinhVien> arr1 = new ArrayList<>();
        ArrayList<MonHoc> arr2 = new ArrayList<>();
        ArrayList<BangDiem> arr3 = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr1.add(x);
        }
        
        sc = new Scanner(new File("MONHOC.in"));
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            MonHoc x = new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            arr2.add(x);
        }
        
        sc = new Scanner(new File("BANGDIEM.in"));
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            String idSV = tmp[0], idMH = tmp[1];
            BangDiem x = new BangDiem(tmp[2]);
            for (SinhVien sv : arr1) {
                if (sv.getIdSV().equals(idSV)) {
                    x.setSv(sv);
                }
            }
            for (MonHoc mh : arr2) {
                if (mh.getIdMH().equals(idMH)) {
                    x.setMh(mh);
                }
            }
            arr3.add(x);
        }
        Collections.sort(arr3);
        int q = Integer.parseInt(sc.nextLine());
        while (q --> 0) {
            String lop = sc.nextLine();
            System.out.println("BANG DIEM lop " + lop + ":");
            for (BangDiem x : arr3) {
                if (x.getSv().getClassName().equals(lop)) {
                    System.out.println(x);
                }
            }
        }
    }
}
