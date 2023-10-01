package j05009;

public class ThiSinh {
    private String id, name, dob;
    private double d1, d2, d3;

    public ThiSinh(int id, String name, String dob, double d1, double d2, double d3) {
        this.id = "" + id;
        this.name = name;
        this.dob = dob;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public String getId() {
        return id;
    }
    
    public double getTongDiem() {
        return this.d1 + this.d2 + this.d3;
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.dob + " " + this.getTongDiem();
    }
}
