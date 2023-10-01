package j04010;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            Point c = new Point(sc.nextDouble(), sc.nextDouble());
            double A = b.distance(c), B = a.distance(c), C = a.distance(b);
            int flag = 0;
            if (A + B <= C || B + C <= A || A + C <= B) {
                flag = 1;
            }
            if (flag == 1){
                System.out.println("INVALID");
            } else {
                double s = (double)1/4 * Math.sqrt((A + B + C) * (A + B - C) * (-A + B + C) * (A - B + C));
                double r = (A * B * C) / (4 * s);
                System.out.printf("%.3f",Math.PI * r * r);
                System.out.println("");
            }
        }
    }
}
