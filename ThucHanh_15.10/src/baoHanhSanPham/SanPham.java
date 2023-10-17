package baoHanhSanPham;

public class SanPham {
    private String idSP, tenSP;
    private int giaBan, thoiHanBaoHanh;

    public SanPham(String idSP, String tenSP, int giaBan, int thoiHanBaoHanh) {
        this.idSP = idSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.thoiHanBaoHanh = thoiHanBaoHanh;
    }

    public String getIdSP() {
        return idSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public int getThoiHanBaoHanh() {
        return thoiHanBaoHanh;
    }
}
