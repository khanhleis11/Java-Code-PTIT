package j05051;

public class KhachHang {
    private String id, loaiSd;
    private long chiSoCu, chiSoMoi;

    public KhachHang(int id, String loaiSd, long chiSoCu, long chiSoMoi) {
        this.id = "KH" + String.format("%02d", id);
        this.loaiSd = loaiSd;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }
    
    public long getHeSo() {
        if (this.loaiSd.equals("KD")) {
            return 3;
        }
        if (this.loaiSd.equals("NN")) {
            return 5;
        }
        if (this.loaiSd.equals("TT")) {
            return 4;
        }
        return 2;
    }
    
    public long getThanhTien() {
        return (this.chiSoMoi - this.chiSoCu) * 550 * this.getHeSo();
    }
    
    public long getPhuTroi() {
        if (this.chiSoMoi - this.chiSoCu < 50) {
            return 0;
        }
        if (this.chiSoMoi - this.chiSoCu <= 100) {
            return Math.round(this.getThanhTien() * 0.35f);
        }
        return this.getThanhTien();
    }
    
    public long getTongTien() {
        return this.getPhuTroi() + this.getThanhTien();
    }
    
    public String toString() {
        return this.id + " " + this.getHeSo() + " " + this.getThanhTien() + " " + this.getPhuTroi() + " " + this.getTongTien();
    }
}
