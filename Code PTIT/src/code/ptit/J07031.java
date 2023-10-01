package code.ptit;

import java.io.*;
import java.util.*;

public class J07031 {
    public static final int N = (int)1e6;
    public static int[] prime = new int[N + 1];
    
    public static void sieve() {
        Arrays.fill(prime, 1);
        prime[0] = prime[1] = 0;
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (prime[i] == 1){
                for (int j = i * i; j <= N; j += i) {
                    prime[j] = 0;
                }
            }
        }
    }
         
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        sieve();
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        
        ArrayList<Integer> arr1 = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) in2.readObject();        
        
        TreeSet<Integer> se1 = new TreeSet<>();
        TreeSet<Integer> se2 = new TreeSet<>();
        for (Integer x : arr1) {
            se1.add(x);
        }
        for (Integer x : arr2) {
            se2.add(x);
        }
        for (Integer x : se1) {
            if (prime[x] == 1 && prime[N - x] == 1 && se1.contains(N - x) && se1.contains(x) && (x < N - x) && !se2.contains(x) && !se2.contains(N - x)) {
                System.out.println(x + " " + (N - x));
            }
        }
    }
}