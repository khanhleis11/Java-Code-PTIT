package j05044;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<NhanVien> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            NhanVien x = new NhanVien(i + 1, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            arr.add(x);
        }
        String s = sc.nextLine();
        for (NhanVien x : arr) {
            if (x.getChucVu().equals(s)) {
                System.out.println(x);
            }
        }
    }
}
