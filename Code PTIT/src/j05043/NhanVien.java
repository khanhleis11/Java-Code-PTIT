package j05043;

public class NhanVien {
    private String id, name, chucVu;
    private int luongCoBan, soNgay;

    public NhanVien(int id, String name, String chucVu, int luongCoBan, int soNgay) {
        this.id = "NV" + String.format("%02d", id);
        this.name = name;
        this.chucVu = chucVu;
        this.luongCoBan = luongCoBan;
        this.soNgay = soNgay;
    }
    
    public int getPhuCap() {
        if (this.chucVu.equals("GD")) {
            return 500;
        }
        if (this.chucVu.equals("PGD")) {
            return 400;
        }
        if (this.chucVu.equals("TP")) {
            return 300;
        }
        if (this.chucVu.equals("KT")) {
            return 250;
        }
        return 100;
    }
    
    public int getLuong() {
        return this.luongCoBan * this.soNgay;
    }
    
    public double getTamUng() {
        if ((this.getPhuCap() + this.getLuong()) * (double)2/3 < 25000) {
            double tmp = (this.getPhuCap() + this.getLuong() * (double)2/3);
            return Math.round(tmp/1000) * 1000;
        }
        return 25000;
    }
    
    public double getConLai() {
        return this.getPhuCap() + this.getLuong() - this.getTamUng();
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.getPhuCap() + " " + this.getLuong() + " " + String.format("%.0f", this.getTamUng()) + " " + String.format("%.0f", this.getConLai());
    }
}
