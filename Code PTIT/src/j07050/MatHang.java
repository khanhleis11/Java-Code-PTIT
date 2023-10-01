package j07050;

public class MatHang {
    private String id, name, group;
    private double giaMua, giaBan;

    public MatHang(int id, String name, String group, double giaMua, double giaBan) {
        this.id = "MH" + String.format("%02d", id);
        this.name = name;
        this.group = group;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    
    public double getLoiNhuan() {
        return this.giaBan - this.giaMua;
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.group + " " + String.format("%.2f", this.getLoiNhuan());
    }
}
