package j05048;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<MaHang> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            MaHang x = new MaHang(sc.nextLine(), Integer.parseInt(sc.nextLine()));
            arr.add(x);
        }
//        String s = sc.nextLine();
        ArrayList<MaHang> res = new ArrayList<>();
        for (MaHang x : arr) {
            System.out.println(x);
        }
        
    }
}
