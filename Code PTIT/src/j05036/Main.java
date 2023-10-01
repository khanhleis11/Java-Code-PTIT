package j05036;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<MatHang> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            MatHang x = new MatHang(i + 1, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            arr.add(x);
        }
        for (MatHang x : arr) {
            System.out.println(x);
        }
    }
}
