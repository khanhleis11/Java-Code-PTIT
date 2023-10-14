package code.ptit;

import java.util.*;

public class J08011 {
    public static boolean checkKhongGiam(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i + 1) < s.charAt(i)) {
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
                if (checkKhongGiam(tmp)) {
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
        
    }
}
