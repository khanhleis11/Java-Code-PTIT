package j06005;

public class MatHang {
    private String idMH, tenMH, dvt;
    private int giaMua, giaBan;

    public MatHang(int idMH, String tenMH, String dvt, int giaMua, int giaBan) {
        this.idMH = "MH" + String.format("%03d", idMH);
        this.tenMH = tenMH;
        this.dvt = dvt;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getIdMH() {
        return idMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public String getDvt() {
        return dvt;
    }

    public int getGiaMua() {
        return giaMua;
    }

    public int getGiaBan() {
        return giaBan;
    }
    
}
