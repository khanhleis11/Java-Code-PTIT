package luyentap12.pkg10;

import java.util.*;

public class dsCanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 1 && i < j) {
                    System.out.println("(" + (i + 1) + "," + (j + 1) + ")");
                }
            }
        }
    }
}
