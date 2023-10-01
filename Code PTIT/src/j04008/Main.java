package j04008;

import java.util.*;

public class Main {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            ArrayList<Double> arr = new ArrayList<>();
            for (int i = 0; i < 6; i++) {
                double tmp = sc.nextDouble();
                arr.add(tmp);
            }
            Point a = new Point(arr.get(0), arr.get(1));
            Point b = new Point(arr.get(2), arr.get(3));
            Point c = new Point(arr.get(4), arr.get(5));
            int flag = 0;
            double x = a.distance(b), y = b.distance(c), z = c.distance(a);
            if (x + y <= z || y + z <= x || z + x <= y) {
                flag = 1;
            }
//            System.out.println(a.distance(b) + " " + b.distance(c) + " " + c.distance(a));
//            System.out.println(flag);
            if (flag == 1) {
                System.out.println("INVALID");
            } else {
                System.out.printf("%.3f", x + y + z);
                System.out.println("");
            }
            arr.clear();
        }
        
    }
}
