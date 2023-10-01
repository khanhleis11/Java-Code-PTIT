package j07049;

public class SanPham {
    private String idSP, tenSP;
    private int giaBan, tgBaoHanh;

    public SanPham(String idSP, String tenSP, int giaBan, int tgBaoHanh) {
        this.idSP = idSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.tgBaoHanh = tgBaoHanh;
    }

    public String getIdSP() {
        return idSP;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public int getTgBaoHanh() {
        return tgBaoHanh;
    }
}
