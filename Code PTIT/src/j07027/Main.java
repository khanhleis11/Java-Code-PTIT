package j07027;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        
        ArrayList<SinhVien> arr1 = new ArrayList<>();
        ArrayList<BaiTap> arr2 = new ArrayList<>();
        ArrayList<Nhom> arr3 = new ArrayList<>();
        HashMap<Integer, String> mp = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr1.add(x);
        }
        
        sc = new Scanner(new File("BAITAP.in"));
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            BaiTap x = new BaiTap(sc.nextLine());
            arr2.add(x);
            mp.put(i + 1, x.getTenBT());
        }
        
        sc = new Scanner(new File("NHOM.in"));
//        n = Integer.parseInt(sc.nextLine());
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            String idSV = tmp[0];
            Nhom x = new Nhom(tmp[1]);
            for (SinhVien sv : arr1) {
                if (sv.getIdSV().equals(idSV)) {
                    x.setSv(sv);
                }
            }
            arr3.add(x);
        }
        Collections.sort(arr3);
        for (Nhom x : arr3) {
            System.out.println(x + " " + mp.get(Integer.valueOf(x.getStt())));
//            System.out.println("");;
        }
    }
}
