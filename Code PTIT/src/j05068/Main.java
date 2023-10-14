package j05068;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<DonHang> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            DonHang x = new DonHang(tmp[0], Long.parseLong(tmp[1]));
            arr.add(x);
        }
        Collections.sort(arr);
        for (DonHang x : arr) {
            System.out.println(x);
        }
    }
}

//3
//N89BP 4500
//D00BP 3500
//X92SH 2600
//
//X92SH Shell 128000 9984000 342784000
//N89BP British Petro 9700 873000 44523000
//D00BP British Petro 11200 1372000 40572000