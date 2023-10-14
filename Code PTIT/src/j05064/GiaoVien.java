package j05064;

public class GiaoVien {
    private String id, name;
    private int luongCoBan;

    public GiaoVien(String id, String name, int luongCoBan) {
        this.id = id;
        this.name = name;
        this.luongCoBan = luongCoBan;
    }
    
    public String getChucVu() {
        return this.id.substring(0, 2);
    }
    
    public int getHeSo() {
        return Integer.parseInt(this.id.substring(2));
    }
    
    public int getPhuCap() {
        if (this.getChucVu().equals("HT")) {
            return 2000000;
        }
        if (this.getChucVu().equals("HP")) {
            return 900000;
        }
        return 500000;
    }
    
    public int getThuNhap() {
        return this.luongCoBan * this.getHeSo() + this.getPhuCap();
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.getHeSo() + " " +  this.getPhuCap() + " " + this.getThuNhap();
    }
}
