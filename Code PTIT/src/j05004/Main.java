package j05004;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            SinhVien x = new SinhVien(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            x.ChuanHoaDob();
            x.ChuanHoaTen();
            arr.add(x);
        }
        
        for (SinhVien x : arr) {
            System.out.println(x);
        }
    }
}
