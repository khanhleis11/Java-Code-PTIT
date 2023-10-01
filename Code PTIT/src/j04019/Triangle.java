package j04019;

public class Triangle {
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
//    public boolean valid() {
//        double ab = Math.sqrt((b.getX() - a.getX()) * (b.getX() - a.getX()) + (b.getY() - a.getY()) * (b.getY() - a.getY()));
//        double bc = Math.sqrt((c.getX() - b.getX()) * (c.getX() - b.getX()) + (c.getY() - b.getY()) * (c.getY() - b.getY()));
//        double ca = Math.sqrt((a.getX() - c.getX()) * (a.getX() - c.getX()) + (a.getY() - c.getY()) * (a.getY() - c.getY()));
//        if (ab + bc > ca && bc + ca > ab && ca + ab > bc) {
//            return true;
//        }
//        return false;
//    }
    
    public boolean valid() {
        double ab = a.distance(b);
        double bc = b.distance(c);
        double ca = c.distance(a);
        if (ab + bc <= ca || bc + ca <= ab || ab + ca <= bc) {
            return false;
        }
        return true;
    }
            
//    public String getPerimeter() {
//        double ab = Math.sqrt((b.getX() - a.getX()) * (b.getX() - a.getX()) + (b.getY() - a.getY()) * (b.getY() - a.getY()));
//        double bc = Math.sqrt((c.getX() - b.getX()) * (c.getX() - b.getX()) + (c.getY() - b.getY()) * (c.getY() - b.getY()));
//        double ca = Math.sqrt((a.getX() - c.getX()) * (a.getX() - c.getX()) + (a.getY() - c.getY()) * (a.getY() - c.getY()));
//        return String.format("%.3f", ab + bc + ca);
//    }
    
    public String getPerimeter() {
        double ab = a.distance(b);
        double bc = b.distance(c);
        double ca = c.distance(a);
        return String.format("%.3f", ab + bc + ca);
    }
     
}
