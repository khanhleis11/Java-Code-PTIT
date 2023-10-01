import java.util.*;
import java.math.BigInteger;

public class J03013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
//            String a = sc.nextLine();
//            String b = sc.nextLine();
            BigInteger a = sc.nextBigInteger();
            int x = a.toString().length();
            BigInteger b = sc.nextBigInteger();
            int y = b.toString().length();
            int ans = Math.max(x, y);
            BigInteger hieu = a.subtract(b);
            hieu = hieu.abs();
            String res = hieu.toString();
            while (res.length() < ans){
                res = ('0' + res);
            }
            System.out.println(res);
        }
    }
}
