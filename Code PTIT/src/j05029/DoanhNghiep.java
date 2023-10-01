package j05029;

public class DoanhNghiep {
    private String id, name;
    private int soSinhVien;

    public DoanhNghiep(String id, String name, int soSinhVien) {
        this.id = id;
        this.name = name;
        this.soSinhVien = soSinhVien;
    }

    public String getId() {
        return id;
    }
    
    public int getSoSinhVien() {
        return soSinhVien;
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.soSinhVien;
    }
}
