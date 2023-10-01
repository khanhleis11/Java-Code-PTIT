package code.ptit;

import java.util.*;

public class J01007 {
    public static long[] f = new long[93];
    public static Set<Long> s = new HashSet<>();
    public static void init() {
        f[0] = 0; 
        f[1] = 1;
        f[2] = 1;
        for (int i = 0; i <= 2; i++){
            s.add(f[i]);
        }
        for (int i = 3; i <= 92; i++){
            f[i] = f[i - 1] + f[i - 2];
            s.add(f[i]);
        }
    }

    public static void main(String[] args) {
        init();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            long n = sc.nextLong();
            if (s.contains(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
    }
}
