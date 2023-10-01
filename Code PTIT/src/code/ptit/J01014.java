import java.util.*;
        
public class J01014 {
    public static long solve(long n) {
        Vector<Long> v = new Vector<>();
        for (long i = 2; i <= Math.sqrt(n); i++){
//            ans = Math.max(ans, i);
            while (n % i == 0){
                n /= i;
                v.add(i);
            }
        }
        if (n != 1){
            v.add(n);
        }
        Collections.sort(v);
        long ans = v.lastElement();
        return ans;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while (t --> 0){
           long n = sc.nextLong();
           System.out.println(solve(n));
//           solve(n);
       }
    }
}
