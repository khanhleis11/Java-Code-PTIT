package j05081;

public class MatHang {
    private String id, name, dvt;
    private int giaMua, giaBan;

    public MatHang(int id, String name, String dvt, int giaMua, int giaBan) {
        this.id = "MH" + String.format("%03d", id);
        this.name = name;
        this.dvt = dvt;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getId() {
        return id;
    }
       
    public int getLoiNhuan() {
        return this.giaBan - this.giaMua;
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.dvt + " " + this.giaMua + " " + this.giaBan + " " + this.getLoiNhuan();
    }
}
