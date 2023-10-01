import java.util.*;

public class J02004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int flag = 1;
            for (int i = 0; i < n / 2; i++) {
                if (a[i] != a[n - i - 1]){
                    flag = 0;
                }
            }
            if (flag == 1){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
