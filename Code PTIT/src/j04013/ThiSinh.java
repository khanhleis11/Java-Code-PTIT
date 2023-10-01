package j04013;

public class ThiSinh {
    private String id, name;
    private double diemToan, diemLy, diemHoa;

    public ThiSinh(String id, String name, double diemToan, double diemLy, double diemHoa) {
        this.id = id;
        this.name = name;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }
    
    public double getDiemUuTien() {
        String kv = this.id.substring(0, 3);
        if (kv.equals("KV1")) {
            return 0.5;
        }
        if (kv.equals("KV2")) {
            return 1.0;
        }
        return 2.5;
    }
    
    public double getTongDiem() {
        return (this.diemHoa + this.diemLy + this.diemToan * 2);
    }
    
    public String getTrangThai() {
        if (this.getTongDiem() + this.getDiemUuTien() >= 24) {
            return "TRUNG TUYEN";
        }
        return "TRUOT";
    }
    
    public String forMat(double a) {
        if (a == (int)a){
            return String.format("%.0f", a);
        } 
        return String.format("%.1f", a);
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.forMat(this.getDiemUuTien()) + " " + this.forMat(this.getTongDiem()) + " " + this.getTrangThai();
    }

}
