import java.util.*;

public class J02021 {
    public static int n, k, cnt = 0;
    public static int[] a = new int[10];
    
    public static void display() {
        for (int i = 1; i <= k; i++){
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }
    
    public static void Try(int i) {
        for (int j = a[i - 1] + 1; j <= n - k + i; j++) {
            a[i] = j;
            if (i == k) {
                display();
                cnt++;
            } else {
                Try(i + 1);
            }
        }
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        Try(1);
        System.out.println("");
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
