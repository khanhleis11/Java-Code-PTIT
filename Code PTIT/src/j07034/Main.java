package j07034;

import java.util.*;
import java.io.*;

public class Main {  
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            MonHoc x = new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.getName().compareTo(o2.getName());
            }
            
        });
        for (MonHoc x : arr) {
            System.out.println(x);
        }
    }
}
