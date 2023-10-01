package j07054;

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
                if (o1.getDiemTb() != o2.getDiemTb()) {
                    if (o1.getDiemTb() < o2.getDiemTb()) {
                        return 1;
                    }
                    return -1;
                }
                return o1.getId().compareTo(o2.getId());
            }
            
        });
        int cnt = 1;
        int i = 0;
        int sz = arr.size();
        for (SinhVien x : arr) {
            int flag = 0;
            if (i > 0 && x.getDiemTb() != arr.get(i - 1).getDiemTb()) {
                cnt++;
                flag = 1;
            }
            if (flag == 1 && i > 0) {
                cnt = i + 1;
            }
            System.out.println(x + " " + cnt);
//            System.out.println("*");
            i++;
        }
    }
}
