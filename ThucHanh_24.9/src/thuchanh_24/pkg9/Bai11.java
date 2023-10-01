package thuchanh_24.pkg9;

import java.util.*;
import java.io.*;

public class Bai11 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        
        ArrayList<String> arr = (ArrayList<String>) in.readObject();
        for (String x : arr) {
            String tmp = "";
            for (char c : x.toCharArray()) {
                if (c == '0' || c == '1') {
                    tmp += c;
                }
            }
            long res = Long.parseLong(tmp, 2);
            System.out.println(tmp + " " + res);
        }
    }
}
