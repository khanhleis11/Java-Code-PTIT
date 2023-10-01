package j04009;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            Point c = new Point(sc.nextDouble(), sc.nextDouble());
            double C = a.distance(b);
            double A = b.distance(c);
            double B = c.distance(a);
            int flag = 0;
//            System.out.println(C + " " + A + " " + B);
            if (C + A <= B || A + B <= C || B + C <= A) {
                flag = 1;
            } 
            if (flag == 1) {
                System.out.println("INVALID");
            } else {
//                double s = (double)1/4 * Math.sqrt(A + B + C) * Math.sqrt(A + B - C) * Math.sqrt(B + C - A) * Math.sqrt(C + A - B);
                double s = (double)1/4 * Math.sqrt((A + B + C) * (A + B - C) * (-A + B + C) * (A - B + C));
                System.out.printf("%.2f", s);
                System.out.println("");
            }
        }
    }
}
