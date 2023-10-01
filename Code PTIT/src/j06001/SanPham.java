package j06001;

public class SanPham {
    private String idSP, tenSP;
    private long donGia1, donGia2;

    public SanPham(String idSP, String tenSP, long donGia1, long donGia2) {
        this.idSP = idSP;
        this.tenSP = tenSP;
        this.donGia1 = donGia1;
        this.donGia2 = donGia2;
    }

    public String getIdSP() {
        return idSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public long getDonGia1() {
        return donGia1;
    }

    public long getDonGia2() {
        return donGia2;
    }
}