package j05046;

import java.util.*;

public class MatHang {
    private String id, name;
    private int soLuong, donGia;
    private static HashMap<String, Integer> mp = new HashMap<>();

    public MatHang(String name, int soLuong, int donGia) {
//        String[] tmp = name.split("\\s+");
//        String ten = tmp[0] + " " + tmp[1];
        this.name = name;
        this.soLuong = soLuong;
        this.donGia = donGia;
        StringTokenizer st = new StringTokenizer(name);
        String ma = "";
        while (st.hasMoreTokens()) {
            ma += st.nextToken().substring(0, 1).toUpperCase();
        }
        ma = ma.substring(0, 2);
        if (!mp.containsKey(ma)) {
            mp.put(ma, 1);
        } else {
            int tanSuat = mp.get(ma);
            
            mp.replace(ma, tanSuat + 1);
        }
        this.id = ma + String.format("%02d", mp.get(ma));
    }
    
    public double getChietKhau() {
        if (this.soLuong > 10) {
            return this.donGia * this.soLuong * 0.05;
        }
        if (this.soLuong >= 8) {
            return this.donGia * this.soLuong * 0.02;
        }
        if (this.soLuong >= 5) {
            return this.donGia * this.soLuong * 0.01;
        }
        return this.donGia * this.soLuong * 0;
    }
    
    public double getThanhTien() {
        return this.donGia * this.soLuong - this.getChietKhau();
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + String.format("%.0f", this.getChietKhau()) + " " + String.format("%.0f", this.getThanhTien());
    }
}
