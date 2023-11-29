package bai3;

public class MonHoc {
    private String idMH, tenMH;
    private int soTin;

    public MonHoc(String idMH, String tenMH, int soTin) {
        this.idMH = idMH;
        this.tenMH = tenMH;
        this.soTin = soTin;
    }

    public String getIdMH() {
        return idMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public int getSoTin() {
        return soTin;
    }
    
}
