package hcnDonSac;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
            b[i] = n - a[i];
        }
//        long res = ;
        System.out.println(Math.max(new DienTich(a).getDienTich(), new DienTich(b).getDienTich()));
    }
}
