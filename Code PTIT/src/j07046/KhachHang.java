package j07046;

import java.time.*;
import java.util.*;

public class KhachHang {
    String id, name, idPhong, ngayDen, ngayDi;

    public KhachHang(int id, String name, String idPhong, String ngayDen, String ngayDi) {
        this.id = "KH" + String.format("%02d", id);
        this.name = name;
        this.idPhong = idPhong;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
    }
    
    public long getNgayLuuTru() {
        String[] arr1 = this.ngayDen.split("/");
        String[] arr2 = this.ngayDi.split("/");
        LocalDate in = LocalDate.of(Integer.valueOf(arr1[2]), Integer.valueOf(arr1[1]), Integer.valueOf(arr1[0]));
        LocalDate out = LocalDate.of(Integer.valueOf(arr2[2]), Integer.valueOf(arr2[1]), Integer.valueOf(arr2[0]));
        
        long totalDays = in.until(out, java.time.temporal.ChronoUnit.DAYS);
        return totalDays;
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.idPhong + " " + this.getNgayLuuTru();
    }
}
