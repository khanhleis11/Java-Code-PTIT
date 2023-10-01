package thuchanh_24.pkg9;

import java.util.*;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t --> 0) {
            String s = sc.nextLine();
            ArrayList<Character> arr = new ArrayList<>();
            String tmp = "";
            int sum = 0;
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    sum += (c - '0');
                } else {
                    arr.add(c);
                }
            }
            
            Collections.sort(arr);
            for (char x : arr) {
                tmp += x;
            }
            System.out.println(tmp + "" + sum);
        }
    }
}
