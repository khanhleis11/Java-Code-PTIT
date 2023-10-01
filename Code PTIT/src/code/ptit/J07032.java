package code.ptit;

import java.util.*;
import java.io.*;

public class J07032 {
    public static boolean checkThuanNghich(Integer n) {
        String s = n.toString();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) != s.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkLe(Integer n) {
        String s = n.toString();
        for (char c : s.toCharArray()) {
            if ((c - '0') % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkSoChuSoLe(Integer n) {
        String s = n.toString();
        int length = s.length();
        return length % 2 != 0 && length > 1;
    }

     
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        
        ArrayList<Integer> arr1 = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) in2.readObject();
        
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        
        for (Integer x : arr1) {
            if (checkThuanNghich(x) && checkLe(x) && checkSoChuSoLe(x) && arr2.contains(x)) {
                mp.put(x, mp.getOrDefault(x, 0) + 1);
            }
        }
        for (Integer x : arr2) {
            if (checkThuanNghich(x) && checkLe(x) && checkSoChuSoLe(x) && mp.get(x) != null) {
                mp.put(x, mp.get(x) + 1);
            }
        }
        
        int cnt = 0;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
//            if (mp.containsKey(entry.getKey())) {
                System.out.println(entry.getKey() + " " + entry.getValue());
                cnt++;
                if (cnt == 10) {
                    break;
                }
//            }
        }
    }
}
