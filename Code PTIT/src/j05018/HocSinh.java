package j05018;

public class HocSinh {
    private String id, name;
    private double d1, d2, d3, d4, d5, d6, d7, d8, d9, d10;

    public HocSinh(int id, String name, double d1, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        this.id = "HS" + String.format("%02d", id);
        this.name = name;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.d4 = d4;
        this.d5 = d5;
        this.d6 = d6;
        this.d7 = d7;
        this.d8 = d8;
        this.d9 = d9;
        this.d10 = d10;
    }

    public String getId() {
        return id;
    }

    public double getDtb() {
//        return Math.round((this.d1 * 2 + this.d2 * 2 + this.d3 + this.d4 + this.d5 + this.d6 + this.d7 + this.d8 + this.d9 + this.d10) / 12);
        double dtb = (this.d1 * 2 + this.d2 * 2 + this.d3 + this.d4 + this.d5 + this.d6 + this.d7 + this.d8 + this.d9 + this.d10) / 12;
        return Math.round(dtb * 10) / 10f;
    }    
    
    public String getXepLoai() {
        if (this.getDtb() >= 9) {
            return "XUAT SAC";
        }
        if (this.getDtb() >= 8) {
            return "GIOI";
        }
        if (this.getDtb() >= 7) {
            return "KHA";
        }
        if (this.getDtb() >= 5) {
            return "TB";
        }
        return "YEU";
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + String.format("%.1f", this.getDtb()) + " " + this.getXepLoai();
    }
}
