package j05052;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<DonHang> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            DonHang x = new DonHang(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            arr.add(x);
        }
        for (DonHang x : arr) {
            System.out.println(x);
        }
    }
}
