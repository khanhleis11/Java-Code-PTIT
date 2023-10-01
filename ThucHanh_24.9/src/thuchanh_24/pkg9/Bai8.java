package thuchanh_24.pkg9;

import java.util.*;
import java.io.*;

public class Bai8 {
    public static boolean checkKhongGiam(Integer n) {
        String s = n.toString();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
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
        
        for (Integer x : arr1) {
            if (checkKhongGiam(x)) {
                if (mp1.containsKey(x)) {
                    int tanSuat = mp1.get(x);
                    tanSuat++;
                    mp1.put(x, tanSuat);
                } else {
                    mp1.put(x, 1);
                }
            }
        }
        
        for (Integer x : arr2) {
            if (checkKhongGiam(x)) {
                if (mp2.containsKey(x)) {
                    int tanSuat = mp2.get(x);
                    tanSuat++;
                    mp2.put(x, tanSuat);
                } else {
                    mp2.put(x, 1);
                }
            }
        }
        
        for (Map.Entry<Integer, Integer> entry : mp1.entrySet()) {
            if (mp2.containsKey(entry.getKey())) {
//                System.out.println(entry.getKey() + " " + entry.);
            }
        }
    }
}
