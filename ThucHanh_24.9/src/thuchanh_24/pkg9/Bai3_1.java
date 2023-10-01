package thuchanh_24.pkg9;

import java.util.*;
import java.io.*;

public class Bai3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int[][] a = new int[n + 1][n + 1];
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    a[i][j] = 0;
                }
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (s.charAt(i - 1) == s.charAt(j - 1) && i != j) {
                        a[i][j] = a[i - 1][j - 1] + 1;
                    } else {
                        a[i][j] = Math.max(a[i - 1][j], a[i][j - 1]);
                    }
                }
            }
            System.out.println(a[n][n]);
        }
    }
}
