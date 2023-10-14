package j05054;

public class HocSinh {
    private String id, name;
    private double dtb;
    private int rank;

    public HocSinh(int id, String name, double dtb) {
        this.id = "HS" + String.format("%02d", id);
        this.name = name;
        this.dtb = dtb;
    }

    public String getId() {
        return id;
    }
    
    public void setRank(int rank) {
        this.rank = rank;
    }

    public double getDtb() {
        return dtb;
    }

    public int getRank() {
        return rank;
    }
    
    public String getXepLoai() {
        if (this.dtb >= 9) {
            return "Gioi";
        }
        if (this.dtb >= 7) {
            return "Kha";
        }
        if (this.dtb >= 5) {
            return "Trung Binh";
        }
        return "Yeu";
    }
    
    public String toString() {
        return this.id  + " " + this.name + " " + this.dtb + " " + this.getXepLoai() + " " + this.rank;
    }
}
