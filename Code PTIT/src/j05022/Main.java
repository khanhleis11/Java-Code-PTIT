package j05022;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> arr = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }
//        for (SinhVien x : arr) {
//            System.out.println(x);
//        }
        int q = sc.nextInt();
        sc.nextLine();
        while (q --> 0) {
            String lop = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + lop + ":");
            for (SinhVien x : arr) {
                if (x.getClassName().equals(lop)) {
                    System.out.println(x);
                }
            }
        }
    }
}
