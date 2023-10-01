package code.ptit;

import java.util.*;
import java.io.*;

public class J07040 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> arr = (ArrayList<String>) in.readObject();
        
        TreeSet<String> se = new TreeSet<>();
        
        for (String x : arr) {
            StringTokenizer st = new StringTokenizer(x);
            while (st.hasMoreTokens()) {
                se.add(st.nextToken().trim().toLowerCase());
            }
        }
        
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while (sc.hasNext()) {
            String s = sc.next().toLowerCase();
            if (se.contains(s)) {
                System.out.println(s);
                se.remove(s);
            }
        }
    }
}
