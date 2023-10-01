package j04021;

import java.util.*;

public class IntSet {
    private TreeSet<Integer> se = new TreeSet<>();

    public IntSet() {
    }
    
    public IntSet(int[] a) {
        for (int i = 0; i < a.length; i++) {
            se.add(a[i]);
        }
    }
    
    public IntSet union(IntSet b) {
        IntSet res = new IntSet();
        for (int x : b.se) {
            res.se.add(x);
        }
        for (int x : this.se) {
            res.se.add(x);
        }
        return res;
    }
    
    public String toString() {
        String res = "";
        for (int x : this.se) {
            res += (x + " ");
        }
        return res;
    }
}
