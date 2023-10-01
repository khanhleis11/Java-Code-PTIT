package j07018;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            SinhVien x = new SinhVien(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
            arr.add(x);
        }
        for (SinhVien x : arr) {
            System.out.println(x);
        }
    }
}
