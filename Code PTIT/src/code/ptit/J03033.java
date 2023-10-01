import java.util.*;
import java.math.BigInteger;

public class J03033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger ucln = a.gcd(b);
            BigInteger tich = a.multiply(b);
            System.out.println(tich.divide(ucln));
        }
    }
}
