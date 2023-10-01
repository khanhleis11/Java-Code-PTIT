package j04001;

public class Point {
    private double x, y, dist;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }    

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double distance(Point a) {
        return Math.sqrt(Math.pow(Math.abs(this.x - a.x), 2) + (Math.pow(Math.abs(this.y - a.y), 2)));
    }
    
    public double distance(Point a, Point b) {
        return Math.sqrt(Math.pow(Math.abs(a.x - b.x), 2) + Math.pow(Math.abs(a.y - b.y), 2));
    }
    
    public void setDist(double dist) {
        this.dist = dist;
    }
        
    public String toString() {
        return String.format("%.4f", this.dist);
    }
}
