package j04012;

public class NhanVien {
    private String id, name;
    private int soNgayCong, luongCoBan;
    private String role;

    public NhanVien(String id, String name, int luongCoBan, int soNgayCong, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.soNgayCong = soNgayCong;
        this.luongCoBan = luongCoBan;
    }
    
    public int getLuong() {
        return this.luongCoBan * this.soNgayCong;
    }
    
    public int getThuong() {
//        System.out.println(this.soNgayCong);
        if (this.soNgayCong >= 25) {
            return (int)(0.2 * this.getLuong());
        }
        if (this.soNgayCong >= 22) {
            return (int)(0.1 * this.getLuong());
        }
        return 0;
    }
    
    public int getPhuCap() {
//        System.out.println(this.role);
        if (this.role.equals("GD")) {
            return 250000;
        }
        if (this.role.equals("PGD")) {
            return 200000;
        }
        if (this.role.equals("TP")) {
            return 180000;
        }
        return 150000;
    }
    
    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.getLuong() + " " + this.getThuong() + " " + this.getPhuCap() + " " + (this.getLuong() + this.getPhuCap() + this.getThuong());
    }
}
