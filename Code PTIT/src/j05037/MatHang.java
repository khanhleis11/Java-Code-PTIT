package j05037;

public class MatHang {
    private String id, name, dvt;
    private int giaNhap, soLuong;

    public MatHang(int id, String name, String dvt, int giaNhap, int soLuong) {
        this.id = "MH" + String.format("%02d", id);
        this.name = name;
        this.dvt = dvt;
        this.giaNhap = giaNhap;
        this.soLuong = soLuong;
    }
    
    public double getPhiVanChuyen() {
        return Math.round(this.giaNhap * this.soLuong * 0.05);
    }
    
    public double getThanhTien() {
        return Math.round(this.giaNhap * this.soLuong + this.getPhiVanChuyen());
    }
    
    public double getGiaBan() {
        return Math.ceil((this.getThanhTien() + 0.02 * this.getThanhTien()) / (this.soLuong * 100)) * 100;
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.dvt + " " + String.format("%.0f", this.getPhiVanChuyen()) + " " + String.format("%.0f", this.getThanhTien()) + " " + String.format("%.0f", this.getGiaBan());
    }
}
