package code.ptit;

import java.io.*;
import java.util.*;
        
public class J07015 {
    public static int[] prime = new int[10000];
    
    public static void sieve() {
        Arrays.fill(prime, 1);
        prime[0] = prime[1] = 0;
        for (int i = 2; i <= Math.sqrt(10000); i++) {
            if (prime[i] == 1) {
                for (int j = i * i; j < 10000; j += i) {
                    prime[j] = 0;
                }
            }
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        sieve();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        int[] cnt = new int[10000];
        ArrayList<Integer> arr = (ArrayList<Integer>) in.readObject();
        for (Integer x : arr) {
            cnt[x]++;
        }
        for (int i = 0; i < 10000; i++) {
            if (cnt[i] > 0 && prime[i] == 1) {
                System.out.println(i + " " + cnt[i]);
            }
        }
    }
}
