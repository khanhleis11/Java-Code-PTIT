package bai15;

import java.util.*;
import java.io.*;

public class WordSet {
    private String a;
    private TreeSet<String> se = new TreeSet<>();

    public WordSet(String a) {
        this.a = a;
    }

    public WordSet() {
    }
    
    public WordSet union(WordSet b) {
        WordSet res = new WordSet();
        StringTokenizer st1 = new StringTokenizer(this.a);
        while (st1.hasMoreTokens()) {
            res.se.add(st1.nextToken().toLowerCase());
        }
        StringTokenizer st2 = new StringTokenizer(b.a);
        while (st2.hasMoreTokens()) {
            res.se.add(st2.nextToken().toLowerCase());
        }
        return res;
    }
    
    public WordSet intersection(WordSet b) {
        WordSet res = new WordSet();
        TreeSet<String> tmp = new TreeSet<>();
        StringTokenizer st1 = new StringTokenizer(this.a);
        while (st1.hasMoreTokens()) {
            tmp.add(st1.nextToken().toLowerCase());
        }
        StringTokenizer st2 = new StringTokenizer(b.a);
        while (st2.hasMoreTokens()) {
            String token = st2.nextToken().toLowerCase();
            if (tmp.contains(token)) {
                res.se.add(token);
            }
        }
        return res;
    }
    
    public String toString() {
        String ans = "";
        for (String x : this.se) {
            ans += (x + " ");
        }
        return ans;
    }
}
