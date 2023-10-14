package code.ptit;

import java.util.*;

public class J08010 {
    public static boolean checkThuanNghich(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> mp = new LinkedHashMap<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.isEmpty()) {
                break;
            }
            StringTokenizer st = new StringTokenizer(s);
            while (st.hasMoreTokens()) {
                String tmp = st.nextToken();
                if (checkThuanNghich(tmp)) {
                    if (!mp.containsKey(tmp)) {
                        mp.put(tmp, 1);
                    } else {
                        int tanSuat = mp.get(tmp);
                        tanSuat++;
                        mp.put(tmp, tanSuat);
                    }
                }
            }   
        }
        int maxLength = 0;
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            maxLength = Math.max(maxLength, entry.getKey().length());
        }
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            if (entry.getKey().length() == maxLength) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
