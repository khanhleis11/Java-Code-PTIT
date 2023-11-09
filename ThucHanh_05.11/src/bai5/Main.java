package bai5;

import java.util.*;

public class Main {
    public static boolean isOperand(String s) {
        if (s.equals("-") || s.equals("+") || s.equals("*") || s.equals("/")) {
            return true;
        }
        return false;
    }
    
    public static long calculate(long a, long b, String s) {
        if (s.equals("+")) {
            return a + b;
        }
        if (s.equals("-")) {
            return a - b;
        }
        if (s.equals("*")) {
            return a * b;
        }
        return a / b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int n = sc.nextInt();
            String[] arr = new String[n];
            Stack<String> st = new Stack<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }
            for (int i = n - 1; i >= 0; i--) {
                if (!isOperand(arr[i])) {
                    st.add(arr[i]);
                } else {
//                    System.out.println(st.pop());
                    Long x = Long.parseLong(st.pop());
                    Long y = Long.parseLong(st.pop());
                    Long res = calculate(x, y, arr[i]);
                    st.add("" + res);
                }
            }
            System.out.println(st.peek());
//            for (String x : arr) {
//                System.out.print(x + " ");
//            }
//            System.out.println("");
        }
    }
}
