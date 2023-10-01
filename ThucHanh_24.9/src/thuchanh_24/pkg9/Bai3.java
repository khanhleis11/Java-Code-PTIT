package thuchanh_24.pkg9;

import java.util.*;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int res = 0;
            HashMap<Character, Integer> mp = new HashMap<>();
            for (char x : s.toCharArray()) {
                if (mp.containsKey(x)) {
                    int tanSuat = mp.get(x);
                    tanSuat++;
                    mp.put(x, tanSuat);
                } else {
                    mp.put(x, 1);
                }
            }
            for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
                res = Math.max(entry.getValue(), res);
            }
            System.out.println(res - 1);
        }
    }
}
