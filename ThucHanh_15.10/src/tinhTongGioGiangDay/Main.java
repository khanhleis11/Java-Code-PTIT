package tinhTongGioGiangDay;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());

        ArrayList<MonHoc> arr1 = new ArrayList<>();
        ArrayList<GiangVien> arr2 = new ArrayList<>();
        ArrayList<GioChuan> arr3 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            String ans = "";
            for (int j = 1; j < tmp.length; j++) {
                ans += tmp[j] + " ";
            }
            MonHoc x = new MonHoc(tmp[0], ans);
            arr1.add(x);
        }

        sc = new Scanner(new File("GIANGVIEN.in"));
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            String ten = "";
            for (int j = 1; j < tmp.length; j++) {
                ten += tmp[j] + " ";
            }
            ten = ten.trim();
            GiangVien x = new GiangVien(tmp[0], ten);
            arr2.add(x);
        }

        sc = new Scanner(new File("GIOCHUAN.in"));
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            GioChuan x = new GioChuan(Double.parseDouble(tmp[2]));
            for (GiangVien gv : arr2) {
                if (gv.getIdGV().equals(tmp[0])) {
                    x.setGv(gv);
                }
            }
            for (MonHoc mh : arr1) {
                if (mh.getIdMH().equals(tmp[1])) {
                    x.setMh(mh);
                }
            }
            arr3.add(x);
        }
        
        HashMap<GiangVien, Double> mp = new HashMap<>();
        for (GioChuan x : arr3) {
            GiangVien gv = x.getGv();
            double gioChuan = x.getGioChuan();
            if (mp.containsKey(gv)) {
                double sum = mp.get(gv);
                mp.put(gv, sum + gioChuan);
            } else {
                mp.put(gv, gioChuan);
            }
        }

        for (GiangVien gv : arr2) {
            System.out.print(gv.getTenGV() + " ");
            System.out.printf("%.2f", mp.get(gv));
            System.out.println();
        }
    }
}
