package j07034;

public class MonHoc {
    private String id, name;
    private int soTin;

    public MonHoc(String id, String name, int soTin) {
        this.id = id;
        this.name = name;
        this.soTin = soTin;
    }

    public String getName() {
        return name;
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.soTin;
    }
}
