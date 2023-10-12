package luyentap12.pkg10;

import java.util.*;
import java.io.*;

public class Email {
    public static String chuanHoaTen(String s) {
        String ans = "";
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            String tmp = st.nextToken();
            ans += tmp.substring(0, 1).toUpperCase();
            ans += tmp.substring(1).toLowerCase() + " ";
        }
        ans = ans.trim();
        return ans;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        LinkedHashSet<String> se = new LinkedHashSet<>();
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            s = chuanHoaTen(s);
            se.add(s);
        }
        LinkedHashMap<String, Integer> mp = new LinkedHashMap<>();
        for (String x : se) {
            String ans = "";
            String[] arr = x.split("\\s+");
            ans += arr[arr.length - 1].toLowerCase();
            for (int i = 0; i < arr.length - 1; i++) {
                ans += arr[i].substring(0, 1).toLowerCase();
            }
            if (!mp.containsKey(ans)) {
                mp.put(ans, 1);
            } else {
                int tanSuat = mp.get(ans);
                tanSuat++;
                mp.put(ans, tanSuat);
            }
            if (mp.get(ans) == 1){
                System.out.println(ans + "@ptit.edu.vn");
            } else {
                System.out.println(ans + mp.get(ans) + "@ptit.edu.vn");
            }
        }
    }
}
