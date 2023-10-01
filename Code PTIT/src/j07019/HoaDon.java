package j07019;

public class HoaDon {
    private String idHD;
    private long soLuongMua;
    private SanPham sp;
    private static long cnt = 1;

    public HoaDon(String idHD, long soLuongMua) {
        this.idHD = idHD + "-" + String.format("%03d", cnt++);
        this.soLuongMua = soLuongMua;
    }
    
    public long getThanhTien() {
        String loai = this.idHD.substring(2, 3);
        if (loai.equals("1")) {
            return sp.getDonGia1() * this.soLuongMua;
        }
        return sp.getDonGia2() * this.soLuongMua;
    }
    
    public long getGiamGia() {
        if (this.soLuongMua >= 150) {
            return this.getThanhTien() / 2;
        }
        if (this.soLuongMua >= 100) {
            return this.getThanhTien() * 3 / 10;
        } else if (this.soLuongMua >= 50) {
            return this.getThanhTien() * 15 / 100;
        }
        return 0;
    }
    
    public long getTienTra() {
        return this.getThanhTien() - this.getGiamGia();
    }
    
    public void setSanPham(SanPham sp) {
        this.sp = sp;
    }
    
    public String toString() {
        return this.idHD + " " + sp.getTenSP() + " " + this.getGiamGia() + " " + this.getTienTra();
    }
}