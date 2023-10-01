package j07047;

public class LoaiPhong {
    private String idLP, tenLP;
    private int donGia;
    private double phiPhucVu;

    public LoaiPhong(String idLP, String tenLP, int donGia, double phiPhucVu) {
        this.idLP = idLP;
        this.tenLP = tenLP;
        this.donGia = donGia;
        this.phiPhucVu = phiPhucVu;
    }

    public String getIdLP() {
        return idLP;
    }

    public int getDonGia() {
        return donGia;
    }

    public double getPhiPhucVu() {
        return phiPhucVu;
    }
}
