package j07007;

import java.util.*;
import java.io.*;

public class WordSet {
    private TreeSet<String> se = new TreeSet<>();
    
    public WordSet(String fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
//        se = new TreeSet<>();
        while (sc.hasNext()) {
            se.add(sc.next().toLowerCase());
        }
    }
    
    public String toString() {
        String res = "";
        for (String x : se) {
            res += x + "\n";
        }
        return res;
    }
}
