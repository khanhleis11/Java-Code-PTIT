package j07055;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            SinhVien x = new SinhVien(i + 1, sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
//                if (o1.getDiemTb() != o2.getDiemTb()) {
                    if (o1.getDiemTb() < o2.getDiemTb()) {
                        return 1;
                    }
                    return -1;
//                }
//                return o1.getId().compareTo(o2.getId());
            }
            
        });
        for (SinhVien x : arr) {
            System.out.println(x);
        }
    }
}
