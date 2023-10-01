package bai13;

public class MonHoc {
    private String id, name, hinhThucThi;

    public MonHoc(String id, String name, String hinhThucThi) {
        this.id = id;
        this.name = name;
        this.hinhThucThi = hinhThucThi;
    }

    public String getId() {
        return id;
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.hinhThucThi;
    }
}
