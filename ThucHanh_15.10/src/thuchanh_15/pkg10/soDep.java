package thuchanh_15.pkg10;

import java.util.*;
import java.io.*;

public class soDep {
    public static boolean check(int n) {
        String s = "" + n;
        if (s.length() < 2) {
            return false;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i + 1) < s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        
//        TreeMap<Integer, Integer> mp1 = new TreeMap<>();
//        TreeMap<Integer, Integer> mp2 = new TreeMap<>();
        TreeSet<Integer> se = new TreeSet<>();
        
        int[] cnt1 = new int[10001];
        int[] cnt2 = new int[10001];
        
        ArrayList<Integer> arr1 = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) in2.readObject();
        
        for (int x : arr1) {
            if (check(x)) {
                se.add(x);
                cnt1[x]++;
            }
        }
        
        for (int x : arr2) {
            if (check(x)) {
                se.add(x);
                cnt2[x]++;
            }
        }
        
        for (int x : se) {
            System.out.println(x + " " + cnt1[x] + " " + cnt2[x]);
        }
    }
}
