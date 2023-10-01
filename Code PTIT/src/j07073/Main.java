package j07073;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            MonHoc x = new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }
        
        ArrayList<MonHoc> res = new ArrayList<>();
        for (MonHoc x : arr) {
            if (x.check()) {
                res.add(x);
            }
            
        }
        Collections.sort(res, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.getId().compareTo(o2.getId());
            }

        });
        for (MonHoc x : res) {
            System.out.println(x);
        }
    }
}
