import java.util.*;

public class J02026 {
    public static int n, k;
    public static int[] a;
    public static int[] x;
    
    public static void display(){
        for (int i = 1; i <= k; i++){
            System.out.print(a[x[i]] + " ");
        }
        System.out.println("");
    }
    
    public static void Try(int i){
        for (int j = x[i - 1] + 1; j <= n - k + i; j++){
            x[i] = j;
            if (i == k){
                display();
            } else {
                Try(i + 1);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            n = sc.nextInt();
            k = sc.nextInt();
            a = new int[n + 1];
            x = new int[n + 1];
            for (int i = 1; i <= n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            Try(1);
//            for (int i = 1; i <= n; i++) {
//                System.out.print(a[i] + " ");
//            }
//            System.out.println("");
        }
    }
}
