package code.ptit;

import java.util.*;

public class JKT013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int n = sc.nextInt();
            Queue<Long> q = new LinkedList<>();
            q.add((long)6);
            q.add((long)8);
            ArrayList<Long> res = new ArrayList<>();
            while (true) {
                long x = q.poll();
                long y = q.poll();
                
                
                res.add(x); res.add(y);
                q.add(x * 10 + 6); q.add(x * 10 + 8);
                q.add(y * 10+ 6); q.add(y * 10 + 8);
            }
            
//            for (long x : res) {
//                System.out.print(x + " ");
//            }
//            System.out.println("");
        }
    }
}
