import java.util.*;
import java.math.BigInteger;

public class J03039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            int flag = 0;
            if (a.compareTo(b) == 1){
                BigInteger res = a.divide(b);
                BigInteger ans = res.multiply(b);
//                System.out.println(ans + " " + a);
                if (ans.equals(a)){
                    flag = 1;
                }
            } else {
                BigInteger res = b.divide(a);
                BigInteger ans = res.multiply(a);
//                System.out.println(ans + " " + b);
                if (ans.equals(b)){
                    flag = 1;
                }
            }
            if (flag == 0){
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
