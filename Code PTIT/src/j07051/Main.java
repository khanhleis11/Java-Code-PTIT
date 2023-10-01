package j07051;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            KhachHang x = new KhachHang(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                if (o1.getThanhTien() < o2.getThanhTien()) {
                    return 1;
                }
                return -1;
            }
            
        });
        for (KhachHang x : arr) {
            System.out.println(x);
        }
    }
}
