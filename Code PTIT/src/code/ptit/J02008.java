import java.util.*;

public class J02008 {
    public static long lcm(long a, long b) {
        long s = (long)a * b;
        while (b != 0) {
            long x = a % b;
            a = b;
            b = x;
        }
        return s / a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int n = sc.nextInt();
            long res = 1;
            for (long i = 2; i <= n; i++) {
                res = lcm(res, i);
            }
            System.out.println(res);
        }
    }
}
