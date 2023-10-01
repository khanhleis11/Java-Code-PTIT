package j04002;

public class Rectange {
    private double width, height;
    private String color;

    public Rectange() {
        this.width = 1;
        this.height = 1;
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double findArea() {
        return this.height * this.width;
    }
    
    public double findPerimeter() {
        return (this.height + this.width) * 2;
    }
    
    public String ChuanHoa(String s) {
//       s = s.toLowerCase();
       String ans = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
       return ans;
    }
    
    public String toString() {
        return String.format("%.0f", this.findPerimeter()) + " " + String.format("%.0f", this.findArea()) + " " + this.ChuanHoa(this.color);
    }
}
