import java.util.Arrays;
import java.util.Scanner;
        
public class J01013 {
    public static final int n = (int)2e6;
    public static int[] prime = new int[n + 5];
    public static void sieve() {
        Arrays.fill(prime, 1);
        prime[0] = prime[1] = 0;
        for (int i = 2; i * i <= n; i++){
            if (prime[i] == 1) {
                for (int j = i * i; j <= n; j += i) {
                   if (prime[j] == 1){
                       prime[j] = i;
                   }
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1){
                prime[i] = i;
            }
        }
    }
    
    public static int calculate(int n) {
        if (prime[n] == 1) {
            return n;
        }
        int sum = 0;
        while (n != 1) {
            sum += prime[n];
            n /= prime[n];
        }
        return sum;
    }
    public static void main(String[] args) {
        sieve();
        Scanner sc = new Scanner(System.in);
//        for (int i = 1; i <= 100; i++){
//            if (prime[i] == 1){
//                System.out.print(i + " ");
//            }
////            System.out.print(prime[i]);
//        }
        int t = sc.nextInt();
        long sum = 0;
        while (t --> 0) {
            int tmp = sc.nextInt();
            sum += calculate(tmp);
        }
        System.out.println(sum);
    }
}
