package code.ptit;

import java.util.*;
import java.io.*;

public class J07016 {
    public static boolean check(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        
        ArrayList<Integer> arr1 = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) in2.readObject();
        
        TreeMap<Integer, Integer> mp1 = new TreeMap<>();
        TreeMap<Integer, Integer> mp2 = new TreeMap<>();
        TreeSet<Integer> se = new TreeSet<>();
        
        for (int x : arr1) {
            if (check(x)) {
                se.add(x);
                if (mp1.containsKey(x)) {
                    int tanSuat = mp1.get(x);
                    tanSuat++;
                    mp1.put(x, tanSuat);
                } else {
                    mp1.put(x, 1);
                }
            }
        }
        
        for (int x : arr2) {
            if (check(x)) {
                se.add(x);
                if (mp2.containsKey(x)) {
                    int tanSuat = mp2.get(x);
                    tanSuat++;
                    mp2.put(x, tanSuat);
                } else {
                    mp2.put(x, 1);
                }
            }
        }
        
        for (int x : se) {
            System.out.println(x + " " + mp1.get(x) + " " + mp2.get(x));
        }
    }
}
