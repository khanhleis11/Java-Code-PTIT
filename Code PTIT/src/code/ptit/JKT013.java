package code.ptit;

import java.util.*;

public class JKT013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Queue<Long> q = new LinkedList<>();
            q.add((long) 6);
            q.add((long) 8);
            ArrayList<Long> res = new ArrayList<>();
            while (true) {
                Long x = q.poll();
                Long y = q.poll();
                String x1 = x.toString();
                String y1 = y.toString();
                if (x1.length() > n && y1.length() > n) {
                    break;
                }
                res.add(x);
                res.add(y);
                q.add(x * 10 + 6);
                q.add(x * 10 + 8);
                q.add(y * 10 + 6);
                q.add(y * 10 + 8);
                
//                count += 2; // Each iteration adds 2 numbers.
            }
            Collections.sort(res, new Comparator<Long>() {
                @Override
                public int compare(Long o1, Long o2) {
                    if (o1 < o2) {
                        return 1;
                    }
                    return -1;
                }
                
            });
            System.out.println(res.size());
            for (long x : res) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
