package j05067;

public class DonHang {
    private String id;
    private long soLuong;

    public DonHang(String id, long soLuong) {
        this.id = id;
        this.soLuong = soLuong;
    }
    
    public long getDonGia() {
        String ma = this.id.substring(0, 1);
        if (ma.equals("X")) {
            return 128000;
        }
        if (ma.equals("D")) {
            return 11200;
        }
        return 9700;
    }
    
    public String getHangSanXuat() {
        String brand = this.id.substring(3);
        if (brand.equals("BP")) {
            return "British Petro";
        }
        if (brand.equals("ES")) {
            return "Esso";
        }
        if (brand.equals("SH")) {
            return "Shell";
        }
        if (brand.equals("CA")) {
            return "Castrol";
        }
        if (brand.equals("MO")) {
            return "Mobil";
        }
        return "Trong Nuoc";
    }
        
    public double getThue() {
//        System.out.println(this.getHangSanXuat());
        if (this.getHangSanXuat().equals("Trong Nuoc")) {
            return 0;
        }
        String ma = this.id.substring(0, 1);
        if (ma.equals("X")) {
            return this.getDonGia() * this.soLuong * (double)0.03;
        }
        if (ma.equals("D")) {
            return this.getDonGia() * this.soLuong * (double)0.035;
        }
        return Math.round(this.getDonGia() * this.soLuong * (double)0.02);
    }
    
    public double getThanhTien() {
        return Math.round(this.soLuong * this.getDonGia() + this.getThue());
    }
    
    public String toString() {
        return this.id + " " + this.getHangSanXuat() + " " + this.getDonGia() + " " + String.format("%.0f", this.getThue()) + " " + String.format("%.0f", this.getThanhTien());
    }
}
