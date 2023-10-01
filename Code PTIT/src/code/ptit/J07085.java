package code.ptit;

import java.util.*;
import java.io.*;

public class J07085 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        
        ArrayList<String> arr = (ArrayList<String>) in.readObject();
        
        for (String x : arr) {
            long num = 0, sumOfNum = 0;
            String tmp = "";
            for (char c : x.toCharArray()) {
                if (Character.isDigit(c)) {
                    tmp += c;
                    sumOfNum += (c - '0');
                }
            }
            long res = Long.parseLong(tmp);
            System.out.println(res + " " + sumOfNum);
        }
        
    }
}
