package j07056;

import java.util.StringTokenizer;

public class KhachHang {
    private String id, name, group;
    private int chiSoDau, chiSoCuoi;

    public KhachHang(int id, String name, String group, int chiSoDau, int chiSoCuoi) {
        this.id = "KH" + String.format("%02d", id);
        this.name = ChuanHoaTen(name);
        this.group = group;
        this.chiSoDau = chiSoDau;
        this.chiSoCuoi = chiSoCuoi;
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
    
    public int getTrongDinhMuc() {
        int soDien = this.chiSoCuoi - this.chiSoDau;
        if (this.group.equals("A")) {
            if (soDien < 100) {
                return soDien * 450;
            }
//            if (soDien > 100) {
                return 100 * 450;
//            }
        }
        if (this.group.equals("B")) {
            if (soDien < 500) {
                return soDien * 450;
            }
//            if (soDien > 500) {
                return 500 * 450;
//            }
        }
        if (soDien < 200) {
            return soDien * 450;
        }
//        if (soDien > 200) {
            return 200 * 450;
//        }
    }
    
    public int getVuotDinhMuc() {
        int soDien = this.chiSoCuoi - this.chiSoDau;
        if (this.group.equals("A")) {
            if (soDien > 100) {
                return (soDien - 100) * 1000;
            }
            return 0;
        }
        if (this.group.equals("B")) {
            if (soDien > 500) {
                return (soDien - 500) * 1000;
            }
            return 0;
        }
        if (soDien > 200) {
            return (soDien - 200) * 1000;
        }
        return 0;
    }
    
    public int getVAT() {
        return this.getVuotDinhMuc() * 5 / 100;
    }
    
    public int getTienNop() {
        return this.getTrongDinhMuc() + this.getVuotDinhMuc() + this.getVAT();
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.getTrongDinhMuc() + " " + this.getVuotDinhMuc() + " " + this.getVAT() + " " + this.getTienNop();
    }
}
