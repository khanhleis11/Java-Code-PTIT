package j05041;

public class NhanVien {
    private String id, name, chucVu;
    private long luongNgay, soNgay;

    public NhanVien(int id, String name, long luongNgay, long soNgay, String chucVu) {
        this.id = "NV" + String.format("%02d", id);
        this.name = name;
        this.luongNgay = luongNgay;
        this.soNgay = soNgay;
        this.chucVu = chucVu;
    }
    
    public long getLuongThang() {
        return this.luongNgay * this.soNgay;
    }
    
    public double getThuong() {
        if (this.soNgay >= 25) {
            return this.getLuongThang() * (double)0.2;
        }
        if (this.soNgay >= 22) {
            return this.getLuongThang() * (double)0.1;
        }
        return 0;
    }
    
    public int getPhuCap() {
        if (this.chucVu.equals("GD")) {
            return 250000;
        }
        if (this.chucVu.equals("PGD")) {
            return 200000;
        }
        if (this.chucVu.equals("TP")) {
            return 180000;
        }
        return 150000;
    }
    
    public double getThucLinh() {
        return this.getLuongThang() + this.getThuong() + this.getPhuCap();
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.getLuongThang() + " " + String.format("%.0f", this.getThuong()) + " " + this.getPhuCap() + " " + String.format("%.0f", this.getThucLinh());
    }
}
