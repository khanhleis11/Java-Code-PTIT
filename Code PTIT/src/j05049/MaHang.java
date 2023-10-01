package j05049;

public class MaHang {
    private String id;
    private int soLuongNhap;

    public MaHang(String id, int soLuongNhap) {
        this.id = id;
        this.soLuongNhap = soLuongNhap;
    }

    public String getId() {
        return id;
    }
    
    public double getSoLuongXuat() {
        if (this.id.charAt(0) == 'A') {
            return this.soLuongNhap * 0.6;
        }
        return this.soLuongNhap * 0.7;
    }
    
    public int getDonGia() {
        if (this.id.charAt(this.id.length() - 1) == 'Y') {
            return 110000;
        }
        return 135000;
    }
    
    public double getTien() {
//        System.out.println(this.getSoLuongXuat() + " " + this.getDonGia());
        return Math.round(this.getSoLuongXuat()) * this.getDonGia();
    }
    
    public double getThue() {
        int n = this.id.length();
        if (this.id.charAt(0) == 'A' && this.id.charAt(n - 1) == 'Y') {
            return this.getTien() * 0.08;
        }
        if (this.id.charAt(0) == 'A' && this.id.charAt(n - 1) == 'N') {
            return this.getTien() * 0.11;
        }
        if (this.id.charAt(0) == 'B' && this.id.charAt(n - 1) == 'Y') {
            return this.getTien() * 0.17;
        }
        return this.getTien() * 0.22;
    }
    
    public String toString() {
        return this.id + " " + this.soLuongNhap + " " + String.format("%.0f", this.getSoLuongXuat()) + " " + this.getDonGia() + " " + String.format("%.0f", this.getTien()) + " " + String.format("%.0f", this.getThue());
    }
}
