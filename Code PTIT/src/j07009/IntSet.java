package j07009;

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
    
    public IntSet intersection(IntSet a) {
        IntSet res = new IntSet();
        for (int x : a.se) {
            if (this.se.contains(x)) {
                res.se.add(x);
            }
        }
        return res;
    }
    
    public String toString() {
        String ans = "";
        for (int x : this.se) {
            ans += (x + " ");
        }
        return ans;
    }
}
