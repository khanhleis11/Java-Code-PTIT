package thuchanh_15.pkg10;

import java.util.*;

public class xauNhiPhanDoiXungDoDaiChan {
    public static boolean checkDoiXung(String s) {
        int n = s.length();
        if (n % 2 != 0) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.add("0"); q.add("1");
            LinkedHashSet<String> se = new LinkedHashSet<>();
//            TreeSet<Long> res = new TreeSet<>();
            while (true) {
                String x = q.poll();
                String y = q.poll();
                if (x.length() > n && y.length() > n) {
                    break;
                }
                if (checkDoiXung(x))
                    se.add(x); 
                if (checkDoiXung(y))
                    se.add(y);
                q.add(x + "0"); q.add(x + "1");
                q.add(y + "0"); q.add(y + "1");
            }
//            for (String x : se) {
//                res.add(Long.parseLong(x));
//            }
            for (String x : se) {
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }
}
