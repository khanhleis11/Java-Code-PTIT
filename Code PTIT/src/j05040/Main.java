package j05040;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<NhanVien> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            NhanVien x = new NhanVien(i + 1, sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()), sc.nextLine());
            arr.add(x);
        }
        long ans = 0;
        for (NhanVien x : arr) {
            ans += x.getThucLinh();
            System.out.println(x);
        }
//        System.out.println("Tong chi phi tien luong: " + ans);
    }
}
