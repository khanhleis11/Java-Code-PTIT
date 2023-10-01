package j04001;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            a.setDist(a.distance(b));
            System.out.println(a);
//            Point c = new Point();
//            c.dist = c.distance(a, b);
//            System.out.println(c.dist);
        }
    }
}
