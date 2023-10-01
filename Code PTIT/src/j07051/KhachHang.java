package j07051;

import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class KhachHang {
    private String id, name, soPhong, ngayNhan, ngayTra;
    private int tienDichVu;

    public KhachHang(int id, String name, String soPhong, String ngayNhan, String ngayTra, int tienDichVu) {
        this.id = "KH" + String.format("%02d", id);
        this.name = ChuanHoaTen(name);
        this.soPhong = soPhong.trim();
        this.ngayNhan = ngayNhan.trim();
        this.ngayTra = ngayTra.trim();
        this.tienDichVu = tienDichVu;
    }
    
    public String ChuanHoaTen(String s) {
        StringTokenizer st = new StringTokenizer(s);
        String ans = "";
        while (st.hasMoreTokens()) {
            String tmp = st.nextToken();
            ans += tmp.substring(0, 1).toUpperCase();
            ans += tmp.substring(1).toLowerCase() + " ";
        }
        ans = ans.trim();
        return ans;
    }
    
    public long getSoNgay() {
        String[] arr1 = this.ngayNhan.split("/");
        String[] arr2 = this.ngayTra.split("/");
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//        }
        LocalDate in = LocalDate.of(Integer.valueOf(arr1[2]), Integer.valueOf(arr1[1]), Integer.valueOf(arr1[0]));
        LocalDate out = LocalDate.of(Integer.valueOf(arr2[2]), Integer.valueOf(arr2[1]), Integer.valueOf(arr2[0]));
        
        long totalDays = in.until(out, java.time.temporal.ChronoUnit.DAYS);

        return totalDays + 1;
//        return 1;
    }
    
    public long getThanhTien() {
        String x = this.soPhong.substring(0, 1);
        if (x.equals("1")) {
            return 25 * this.getSoNgay() + this.tienDichVu;
        }
        if (x.equals("2")) {
            return 34 * this.getSoNgay() + this.tienDichVu;
        }
        if (x.equals("3")) {
            return 50 * this.getSoNgay() + this.tienDichVu;
        }
        return 80 * this.getSoNgay() + this.tienDichVu;
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.soPhong + " " + this.getSoNgay() + " " + this.getThanhTien();
    }
}
