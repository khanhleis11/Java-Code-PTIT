package code.ptit;

import java.util.*;
import java.io.*;

public class J07006 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) in.readObject();
        
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        
        for (int x : arr) {
            if (mp.containsKey(x)) {
                int tanSuat = mp.get(x);
                tanSuat++;
                mp.put(x, tanSuat);
            } else {
                mp.put(x, 1);
            }
        }
        
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
