package demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Toi yeu PTIT!");
        Scanner in = new Scanner(System.in);
//        int a;
//        System.out.print("Nhap a: ");
//        a = in.nextInt();
//        System.out.println("a = " + a);
//          int n;
//          n = in.nextInt();
//          int a[] = new int[n];
//          for (int i = 0; i < n; i++){
//              a[i] = in.nextInt();
//          }
//          for (int i = 0; i < n; i++){
//              System.out.print(a[i] + " ");
//          }
//          System.out.println("");
//          String ten;
//          xóa bộ nhớ đệm
//          in.nextLine();
//          ten = in.nextLine();
//          System.out.println("Ten: " + ten);
            int n, m; 
            n = in.nextInt();
            m = in.nextInt();
            int a[][] = new int[n][m];
//            for (int i = 0; i < n; i++){
//                a[i] = new int[m];
//            }
            for (int i = 0; i < n; i++){
                for (int j = 0; j < m; j++){
                    a[i][j] = in.nextInt();
                }
            }
            for (int i = 0; i < n; i++){
                for (int j = 0; j < m; j++){
                    System.out.print(a[i][j] + " ");
                }
                System.out.println("");
            }
    }
    
}
