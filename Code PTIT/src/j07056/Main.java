package j07056;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<KhachHang> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            KhachHang x = new KhachHang(i + 1, name, tmp[0], Integer.parseInt(tmp[1]), Integer.parseInt(tmp[2]));
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                return o2.getTienNop() - o1.getTienNop();
            }
            
        });
        for (KhachHang x : arr) {
            System.out.println(x);
        }
    }
}
