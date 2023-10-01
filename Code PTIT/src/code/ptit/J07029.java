package code.ptit;

import java.io.*;
import java.util.*;

public class J07029 {
    public static final int N = (int)1e6;
    public static int[] prime = new int[N + 1];
    
    public static void sieve() {
        Arrays.fill(prime, 1);
        prime[0] = prime[1] = 0;
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (prime[i] == 1) {
                for (int j = i * i; j <= N; j += i) {
                    prime[j] = 0;
                }
            }
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        sieve();
        int[] cnt = new int[N + 1];
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) in.readObject();
        for (Integer x : arr) {
            cnt[x]++;
        }
        int res = 0;
        for (int i = 1000000; i >= 2; i--) {
            if (cnt[i] > 0 && prime[i] == 1) {
                res++;
                System.out.println(i + " " + cnt[i]);
                if (res == 10) {
                    break;
                }
            }
            
            
        }
    }
}
