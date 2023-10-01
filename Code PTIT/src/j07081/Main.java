package j07081;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getTen().equals(o2.getTen())) {
                    if (o1.getHo().equals(o2.getHo())) {
                        if (o1.getDem().equals(o2.getDem())) {
                            return o1.getId().compareTo(o2.getId());
                        }
                        return o1.getDem().compareTo(o2.getDem());
                    }
                    return o1.getHo().compareTo(o2.getHo());
                }
                return o1.getTen().compareTo(o2.getTen());
            }
            
        });
        for (SinhVien x : arr) {
            System.out.println(x);
        }
    }
}
