package j05058;

public class ThiSinh implements Comparable<ThiSinh> {
    private String id, name;
    private double d1, d2, d3;

    public ThiSinh(String id, String name, double d1, double d2, double d3) {
        this.id = id;
        this.name = name;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
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
    
    public double getTongDiem() {
        return this.d1 * 2 + this.d2 + this.d3 + this.getDiemUuTien();
    }
    
    public String getTrangThai() {
        if (this.getTongDiem() + this.getDiemUuTien() >= 24) {
            return "TRUNG TUYEN";
        }
        return "TRUOT";
    }
    
    public String format(double x) {
        if (x == (int)x) {
            return "" + (int)x;
        }
        return String.format("%.1f", x);
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.format(this.getDiemUuTien()) + " " + this.format(this.getTongDiem()) + " " + this.getTrangThai();
    }
    
    @Override
    public int compareTo(ThiSinh o) {
        if (this.getTongDiem() != o.getTongDiem()) {
            if (this.getTongDiem() < o.getTongDiem()) {
                return 1;
            }
            return -1;
        }
        return this.id.compareTo(o.id); // Compare based on IDs if total scores are equal
    }
    
//    @Override
//    public int compareTo(ThiSinh o) {
//        if (this.getTongDiem() != o.getTongDiem()) {
//            if (this.getTongDiem() < o.getTongDiem()) {
//                return 1;
//            }
//            return -1;    
//        }
//        return this.id.compareTo(o.id);
//    }
}
