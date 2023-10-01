package j07054;

import java.util.StringTokenizer;

public class SinhVien {
    private String id, name;
    private double d1, d2, d3;

    public SinhVien(int id, String name, double d1, double d2, double d3) {
        this.id = "SV" + String.format("%02d", id);
        this.name = ChuanHoaTen(name);
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public String getId() {
        return id;
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
    
    public double getDiemTb() {
        double tmp = (this.d1 * 3 + this.d2 * 3 + this.d3 * 2) / 8;
        tmp = Math.round(tmp * 100) / (double)100;
        return tmp;
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + String.format("%.2f", this.getDiemTb());
    }
}
