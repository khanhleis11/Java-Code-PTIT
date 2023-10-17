package thuchanh_15.pkg10;

import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class phepToanCoBan {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<BigInteger> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            BigInteger tmp = sc.nextBigInteger();
            arr.add(tmp);
        }
        Collections.sort(arr);
        System.out.println(arr.get(0));
        System.out.println(arr.get(arr.size() - 1));
        BigInteger sum = BigInteger.ZERO;
        for (BigInteger x : arr) {
            sum = sum.add(x);
        } 
        System.out.println(sum);
    }
}
