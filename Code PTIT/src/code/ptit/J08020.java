package code.ptit;

import java.util.*;

public class J08020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t --> 0) {
            String s = sc.nextLine();
            Stack<Character> st = new Stack<>();
            int flag = 0;
            for (char x : s.toCharArray()) {
                if (x == '(' || x == '[' || x == '{') {
                    st.add(x);
                }
                if (st.empty()) {
                    flag = 0;
                } else {
                    Character in = st.peek(), out = x;
//                    st.pop();
                    if (out == ')' && in == '(') {
                        st.pop();
                    } else if (out == ']' && in == '[') {
                        st.pop();
                    } if (out == '}' && in == '{') {
                        st.pop();
                    }
                }
            }
            if (st.empty()) {
                flag = 1;
            }
            if (flag == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
