package thuchanh_15.pkg10;

import java.util.*;
import java.io.*;

public class xuLyVanBan {
    public static boolean check(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String> se = new TreeSet<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.isEmpty()) {
                break;
            }
            StringTokenizer st = new StringTokenizer(s);
            while (st.hasMoreTokens()) {
                String tmp = st.nextToken();
                if (check(tmp)) {
                    se.add(tmp);
                }
            }
        }
        for (String x : se) {
            System.out.println(x);
        }
    }
}
