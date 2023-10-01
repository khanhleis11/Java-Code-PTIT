import java.util.*;

public class J01026 {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int n = sc.nextInt();
            double ans = Math.sqrt(n);
            double res = (int)Math.sqrt(n);
//            if (ans == )
//            System.out.println(ans + " " + res);
            if (res == ans) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
