package j07057;

import java.util.StringTokenizer;

public class ThiSinh {
    private String id, name;
    private double diem;
    private String danToc, khuVuc;

    public String getId() {
        return id;
    }
    
    public ThiSinh(int id, String name, double diem, String danToc, String khuVuc) {
        this.id = "TS" + String.format("%02d", id);
        this.name = ChuanHoaTen(name);
        this.diem = diem;
        this.danToc = danToc;
        this.khuVuc = khuVuc;
    }
    
    public double getUuTienKv() {
        if (this.khuVuc.equals("1")) {
            return 1.5;
        }
        if (this.khuVuc.equals("2")) {
            return 1;
        }
        return 0;
    }
    
    public double getUuTienDt() {
        if (this.danToc.equals("Kinh")) {
            return 0;
        }
        return 1.5;
    }
    
    public double getDiemUuTien() {
        return this.getUuTienDt() + this.getUuTienKv();
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
    
    public double getTongDiem() {
        String tmp = String.format("%.1f", this.diem + this.getDiemUuTien());
        double res = Double.valueOf(tmp);
        return res;
    }
    
    public String getTrangThai() {
        if (this.getTongDiem() >= 20.5) {
            return "Do";
        }
        return "Truot";
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.getTongDiem() + " " + this.getTrangThai();
    }
}
