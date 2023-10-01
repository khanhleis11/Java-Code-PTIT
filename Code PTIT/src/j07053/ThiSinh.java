package j07053;

//import java.io.*;
import java.util.*;

public class ThiSinh {
    private String id, name, dob;
    private double diemLyThuyet, diemThucHanh;

    public ThiSinh(int id, String name, String dob, double diemLyThuyet, double diemThucHanh) {
        this.id = "PH" + String.format("%02d", id);
        this.name = ChuanHoaTen(name);
        this.dob = dob;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
    }
    
    public String ChuanHoaTen(String s) {
        String ans = "";
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            String tmp = st.nextToken();
            ans += tmp.substring(0, 1).toUpperCase();
            ans += tmp.substring(1).toLowerCase() + " ";
        }
        ans = ans.trim();
        return ans;
    }
    
    public int getTuoi() {
        String[] arr = this.dob.split("/");
        int age = Integer.valueOf(arr[2]);
        return 2021 - age;
    }
    
    public double getDiemThuong() {
        if (this.diemLyThuyet >= 8 && this.diemThucHanh >= 8) {
            return 1;
        }
        if (this.diemLyThuyet >= 7.5 && this.diemThucHanh >= 7.5) {
            return 0.5;
        }
        return 0;
    }
    
    public long getDiemTb() {
        double tmp = (this.diemThucHanh + this.diemLyThuyet) / 2 + this.getDiemThuong();
        if (tmp > 10) {
            return 10;
        }
        return Math.round(tmp);
    }
    
    public String getXepLoai() {
        if (this.getDiemTb() >= 9) {
            return "Xuat sac";
        }
        if (this.getDiemTb() >= 8) {
            return "Gioi";
        }
        if (this.getDiemTb() >= 7) {
            return "Kha";
        }
        if (this.getDiemTb() >= 5) {
            return "Trung binh";
        }
        return "Truot";
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.getTuoi() + " " + this.getDiemTb() + " " + this.getXepLoai();
    }
}
