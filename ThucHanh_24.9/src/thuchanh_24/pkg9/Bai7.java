package thuchanh_24.pkg9;

import java.util.*;
import java.io.*;

public class Bai7 {
    public static boolean isNum(String s) {
        for (char x : s.toCharArray()) {
            if (!Character.isDigit(x)) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean check(String s) {
        if (s.length() > 18) {
            return false;
        }
        Long x = Long.parseLong(s);
        if (x > Integer.MAX_VALUE && x <= Long.MAX_VALUE) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            while (st.hasMoreTokens()) {
                String tmp = st.nextToken();
                if (isNum(tmp) && check(tmp)) {
                    sum += Long.valueOf(tmp);
                }
            }
        }
        System.out.println(sum);
    }
}
