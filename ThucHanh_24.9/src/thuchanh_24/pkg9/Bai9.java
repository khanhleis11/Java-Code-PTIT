package thuchanh_24.pkg9;

import java.io.*;
import java.util.*;

public class Bai9 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while (t --> 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[][] a = new int[n + 1][m + 1];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    if (j == k) {
                        arr.add(a[i][j]);
                    }
                }
            }
            Collections.sort(arr);
            int cnt = 1;
            for (int x : arr) {
                a[cnt][k] = x;
                cnt++;
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }
}
