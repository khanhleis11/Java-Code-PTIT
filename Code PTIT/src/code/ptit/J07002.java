import java.util.*;
import java.io.*;

public class J07002 {
    public static boolean isNum(String s){
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) < '0' || s.charAt(i) > '9'){
                return false;
            }
        }
        if (s.length() > 10){
            return false;
        }
        long tmp = Long.parseLong(s);
        if (tmp >= Integer.MAX_VALUE || tmp <= Integer.MIN_VALUE){
            return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while (sc.hasNextLine()){
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            while (st.hasMoreTokens()){
                String tmp = st.nextToken();
                if (isNum(tmp)){
                    sum += Long.parseLong(tmp);
                }
            }
//            System.out.println(s);
        }
        System.out.println(sum);
    }
}
