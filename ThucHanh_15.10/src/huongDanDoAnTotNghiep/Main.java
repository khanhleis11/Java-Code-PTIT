package huongDanDoAnTotNghiep;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        
        ArrayList<SinhVien> arr1 = new ArrayList<>();
        ArrayList<GiangVien> arr2 = new ArrayList<>();
        
        while (sc.hasNextLine()) {
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr1.add(x);
        }
        
        sc = new Scanner(new File("HUONGDAN.in"));
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            String ten = "";
            for (int k = 0; k < tmp.length - 1; k++) {
                ten += tmp[k] + " ";
            }
            ten = ten.trim();
//            String ten = tmp[0];
            int t = Integer.parseInt(tmp[tmp.length - 1]);
            while (t --> 0) {
                String y = sc.nextLine();
                String[] tmp1 = y.split("\\s+");
                String tenDoAn = "";
                for (int j = 1; j < tmp1.length; j++) {
                    tenDoAn += tmp1[j] + " ";
                }
                tenDoAn = tenDoAn.trim();
                GiangVien x = new GiangVien(ten, tenDoAn);
                for (SinhVien sv : arr1) {
                    if (sv.getId().equals(tmp1[0])) {
                        x.setSv(sv);
                    }
                }
                arr2.add(x);
            }
        }
        Collections.sort(arr2);
        for (GiangVien x : arr2) {
            System.out.println(x);
        }
    }
}

//B21DCCN123
//Tran Van Toan
//D21CQCN01-B
//toantv@gmail.com
//987654321
//B21DCCN111
//Ly Van Binh
//D21CQCN01-B
//binhlv@gmail.com
//978652142
//B21DCAT661
//Hoang Tam Anh
//D21CQAT01-B
//anhht@gmail.com
//966554321
//
//2
//Tran Van Nam 2
//B21DCCN111 Phat trien ung dung TMDT
//B21DCAT661 Xay dung ung dung quan ly ban hang
//Duong Tuan Anh 1
//B21DCCN123 Xay dung game nhap vai voi Unity 3D
