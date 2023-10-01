package j07052;

import java.util.StringTokenizer;

public class ThiSinh {
    private String id, name;
    private double diemToan, diemLy, diemHoa;

    public ThiSinh(String id, String name, double diemToan, double diemLy, double diemHoa) {
        this.id = id;
        this.name = ChuanHoaTen(name);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public String getId() {
        return id;
    }
    
    public double getDiemUuTien() {
        String x = this.id.substring(0, 3);
        if (x.equals("KV1")) {
            return 0.5;
        }
        if (x.equals("KV2")) {
            return 1.0;
        }
        return 2.5;
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
    
    public double getDiem() {
        return this.diemHoa + this.diemLy + this.diemToan * 2 + this.getDiemUuTien();
    }
    
    public String Format(double x) {
        if (x == (int)x) {
            return "" + (int)x;
        }
        return String.format("%.1f", x);
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.Format(this.getDiemUuTien()) + " " + this.Format(this.getDiem());
    }
}
