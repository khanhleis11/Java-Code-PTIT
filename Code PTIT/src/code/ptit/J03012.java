import java.util.*;
import java.math.BigInteger;

public class J03012 {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
//        sc.nextLine();
        while (t --> 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
//            BigInteger sum = a.add(b);
            System.out.println(a.add(b));
        }
    }
}
