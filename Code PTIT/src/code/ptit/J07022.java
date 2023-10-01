import java.util.*;
import java.io.*;

public class J07022 {
    public static boolean isNum(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++){
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                return false;
            }
        }
        if (s.length() > 10){
            return false;
        }
        long tmp = Long.parseLong(s);
        if (tmp >= Integer.MAX_VALUE || tmp <= Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> se = new ArrayList<>();
        while(sc.hasNext()) {
            String s = sc.next();
            if (!isNum(s)) {
//                System.out.println(s);
                se.add(s);
            }
        }
        Collections.sort(se);
        for (String x : se){
            System.out.print(x + " ");
        }
        System.out.println("");
    }
}
