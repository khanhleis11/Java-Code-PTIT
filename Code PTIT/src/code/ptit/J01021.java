import java.util.*;

public class J01021 {
    public static final int MOD = (int)1e9 + 7;
    
//    public static int pow(int a, long b) {
//        if (b == 1){
//            return a;
//        } else {
//            if (b % 2 == 0){
//                return (int) ((pow(a, b / 2) * pow(a, b / 2)) % mod);
//            } else {
//                return pow(a, b / 2) * pow(a, b / 2) % mod * a;
//            }
//        }
//    }
    public static long pow(long a, long n) {
        if (n == 0){
            return 1;
        }
        if (n == 1) {
            return a % MOD;
        } else {
            if (n % 2 == 0) {
                long halfPow =  (pow(a, n / 2) % MOD);
                return  ((halfPow * halfPow) % MOD);
            } else {
                long halfPow = (pow(a, n / 2) % MOD);
                return ((((halfPow * halfPow) % MOD) * a) % MOD);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a == 0 || b == 0) {
                break;
            }
//            double res = Math.pow(a, b) % mod;
            System.out.println(pow(a, b));
        }
    }
}
