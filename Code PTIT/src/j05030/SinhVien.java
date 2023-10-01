package j05030;

public class SinhVien {
    private String id, name, className;
    private double d1, d2, d3;

    public SinhVien(String id, String name, String className, double d1, double d2, double d3) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public String getId() {
        return id;
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.className + " " + this.d1 + " " + this.d2 + " " + this.d3;
    }
}
