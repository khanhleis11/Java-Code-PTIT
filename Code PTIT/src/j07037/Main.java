package j07037;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            DoanhNghiep x = new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<DoanhNghiep>() {
            @Override
            public int compare(DoanhNghiep o1, DoanhNghiep o2) {
                return o1.getId().compareTo(o2.getId());
            }
            
        });
        for (DoanhNghiep x : arr) {
            System.out.println(x);
        }
    }
}
