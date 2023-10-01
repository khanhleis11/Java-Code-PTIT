package j07035;

public class MonHoc {
    private String idMH, tenMH;
    private int soTin;
    private String diem;

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
    
}
