package thuchanh_15.pkg10;

import java.util.*;

public class demCap {
    public static long solve(int[] a) {
        long cnt = 0;
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < a.length; i++) {
            while (!st.isEmpty() && a[i] > st.peek()) {
                int j = st.pop();
                cnt += i - j;
            }
            if (!st.isEmpty()) {
                cnt++;
            }
            st.push(a[i]);
        }
        return cnt;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long res = solve(arr);
        System.out.println(res);
    }
}
