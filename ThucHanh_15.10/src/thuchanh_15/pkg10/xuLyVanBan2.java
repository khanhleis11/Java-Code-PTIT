package thuchanh_15.pkg10;

import java.util.*;
import java.io.*;

public class xuLyVanBan2 {
    public static boolean check(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.' || s.charAt(i) == ',' || s.charAt(i) == '!' || s.charAt(i) == '?' || s.charAt(i) == ':') {
                return false;
            }
        }
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                flag = 1;
            }
        }
        if (flag == 1)
            return true;
        return false;
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

//PTIT duy tri hoc phi nam 2019 va khong tang hoc phi
//trong nam 2020, 2021 va 2021 den 2022.
//PTIT da trich 6 ty d0ong ho tro moi si1nh vien 500000!