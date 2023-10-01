package j05052;

import java.util.*;

public class DonHang {
    private String name, id;
    private int donGia, soLuong;

    public DonHang(String name, String id, int donGia, int soLuong) {
        this.name = name;
        this.id = id;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    
    public String getMa() {
        int n = this.id.length();
        return this.id.substring(n - 1, n);
    }
    
    public String getSTT() {
        String tmp = this.id.substring(1, 4);
        return tmp;
    }
    
    public int getGiamGia() {
        if (this.getMa().equals("1")) {
            return this.donGia * this.soLuong / 2;
        }
        return this.donGia * this.soLuong * 3 / 10;
    }
    
    public int getThanhTien() {
        return this.donGia * this.soLuong - this.getGiamGia();
    }
    
    public String toString() {
        return this.name + " " + " " + this.getSTT() + " " + this.getGiamGia() + " " + this.getThanhTien();
    }
}
