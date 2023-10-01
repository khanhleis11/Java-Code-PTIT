package j04019;

import java.util.*;

public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double distance(Point a) {
        return Math.sqrt(Math.pow(this.x - a.x, 2) + Math.pow(this.y - a.y, 2));
    }
    
    public static Point nextPoint(Scanner sc) {
        return new Point(sc.nextDouble(), sc.nextDouble());        
    }

//    public double getX() {
//        return x;
//    }
//
//    public double getY() {
//        return y;
//    }
    
    
}
