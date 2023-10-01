package j07047;

import java.time.*;
import static java.time.temporal.ChronoUnit.DAYS;

public class KhachHang implements Comparable<KhachHang>{
    private String idKH, tenKH, idPhong, ngayDen, ngayDi;
    private LoaiPhong lp;
    private Long tongNgay;

    public KhachHang(int idKH, String tenKH, String idPhong, String ngayDen, String ngayDi) {
        this.idKH = "KH" + String.format("%02d", idKH);
        this.tenKH = tenKH;
        this.idPhong = idPhong;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
    }

    public void setLp(LoaiPhong lp) {
        this.lp = lp;
    }
    
    public long getSoNgay() {
        String[] tmp1 = this.ngayDen.split("/");
        LocalDate in = LocalDate.of(Integer.parseInt(tmp1[2]), Integer.parseInt(tmp1[1]), Integer.parseInt(tmp1[0]));
        
        String[] tmp2 = this.ngayDi.split("/");
        LocalDate out = LocalDate.of(Integer.parseInt(tmp2[2]), Integer.parseInt(tmp2[1]), Integer.parseInt(tmp2[0]));
        
        long totalDays = in.until(out, DAYS);
        this.tongNgay = totalDays;
        if (totalDays == 0) {
            return 1;
        }
        return totalDays;
    }
    
    public long getThanhTien() {
       return lp.getDonGia() * this.getSoNgay();
    }
    
    public double getPhiPhucVu() {
        return lp.getPhiPhucVu() * lp.getDonGia() * this.getSoNgay();
    }
    
    public double getGiamGia() {
        if (this.getSoNgay() > 30) {
            return (this.getThanhTien() + this.getPhiPhucVu()) * 6 / 100;
        }
        if (this.getSoNgay() >= 20) {
            return (this.getThanhTien() + this.getPhiPhucVu()) * 4 / 100;
        }
        if (this.getSoNgay() > 10) {
            return (this.getThanhTien() + this.getPhiPhucVu()) * 2 / 100;
        }
        return 0;
    }
    
    public String getPhaiTra() {
        return String.format("%.2f", this.getThanhTien() + this.getPhiPhucVu() - this.getGiamGia());
    }
    
    public String toString() {
        return this.idKH + " " + this.tenKH + " " + this.idPhong + " " + (this.tongNgay) + " " + this.getPhaiTra();
    }

    @Override
    public int compareTo(KhachHang o) {
        if (this.getSoNgay() < o.getSoNgay()) {
            return 1;
        }
        return -1;
    }
}
