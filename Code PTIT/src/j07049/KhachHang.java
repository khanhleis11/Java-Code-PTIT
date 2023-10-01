package j07049;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class KhachHang implements Comparable<KhachHang>{
    private String idKH, tenKH, add;
    private int soLuong;
    private String ngayMua;
    private SanPham sp;

    public KhachHang(int idKH, String tenKH, String add, int soLuong, String ngayMua) {
        this.idKH = "KH" + String.format("%02d", idKH);
        this.tenKH = tenKH;
        this.add = add;
        this.soLuong = soLuong;
        this.ngayMua = ngayMua;
    }

    public void setSp(SanPham sp) {
        this.sp = sp;
    }
    
    public long getTongTien() {
        return (long)sp.getGiaBan() * this.soLuong;
    }

    public String getNgayBaoHanh() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate purchaseDate = LocalDate.parse(this.ngayMua, formatter);
        LocalDate expirationDate = purchaseDate.plusMonths(sp.getTgBaoHanh());
        return expirationDate.format(formatter);
    }

    
    public LocalDate getDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(this.getNgayBaoHanh(), formatter);
    }

    public String toString() {
        return this.idKH + " " + this.tenKH + " " + this.add + " " + sp.getIdSP() + " " + this.getTongTien() + " " + this.getNgayBaoHanh();
    }
    
    @Override
    public int compareTo(KhachHang o) {
        if (this.getDate().equals(o.getDate())) {
            return this.idKH.compareTo(o.idKH);
        }
        return this.getDate().compareTo(o.getDate());
    }
}
