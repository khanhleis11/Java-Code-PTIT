package j07025;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<KhachHang> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            KhachHang x = new KhachHang(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                if (o1.getYear() == o2.getYear()) {
                    if (o1.getMonth() == o2.getMonth()) {
                        return o1.getDay() - o2.getDay();
                    }
                    return o1.getMonth() - o2.getMonth();
                }
                return o1.getYear() - o2.getYear();
            }       
        });
        for (KhachHang x : arr) {
            System.out.println(x);
        }
    }
}
