package j06002;

public class SanPham {
    private String idSP, tenSP;
    private int donGia1, donGia2;

    public SanPham(String idSP, String tenSP, int donGia1, int donGia2) {
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

    public int getDonGia1() {
        return donGia1;
    }

    public int getDonGia2() {
        return donGia2;
    }
}
