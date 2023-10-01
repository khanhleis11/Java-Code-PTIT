package j07024;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordSet {
    private String s;
    private TreeSet<String> se = new TreeSet<>();
    
    public WordSet(String in) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(in));
        while (sc.hasNextLine()) {
            String x = sc.nextLine();
            this.s = x;
            StringTokenizer st = new StringTokenizer(this.s);
            while (st.hasMoreTokens()) {
                String tmp = st.nextToken().toLowerCase();
                this.se.add(tmp);
            }
        }
    }

    public WordSet() {
    }
    
    public WordSet difference(WordSet o) {
        WordSet res = new WordSet();
        for (String x : this.se) {
            if (!o.se.contains(x)) {
                res.se.add(x);
            }
        }
        return res;
    }
    
    public String toString() {
        String ans = "";
        for (String x : this.se) {
            ans += x + " ";
        } 
        return ans;
    }
}
