import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class J07003 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        BigInteger a = sc.nextBigInteger();
        while (true){
            int length = a.toString().length();
            if (length == 1){
                break;
            }
            int n = length / 2;
            String tmp = a.toString();
            String x = tmp.substring(0, n);
            String y = tmp.substring(n, length);
            BigInteger l = new BigInteger(x);
            BigInteger r = new BigInteger(y);
            a = l.add(r);
            System.out.println(a);
        }
    }
}
