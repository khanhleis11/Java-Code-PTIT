package bai2;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getMinute() != o2.getMinute()) {
                    if (o1.getMinute() < o2.getMinute()) {
                        return 1;
                    }
                    return -1;
                }
                return o1.getName().compareTo(o2.getName());
            }
            
        });
        for (SinhVien x : arr) {
            System.out.println(x);
        }
    }
}
