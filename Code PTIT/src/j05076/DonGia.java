package j05076;

public class DonGia {
    private String id;
    private int soLuongNhap, donGiaNhap, soLuongXuat;
    private MatHang mh;

    public void setMh(MatHang mh) {
        this.mh = mh;
    }
    
    public DonGia(String id, int soLuongNhap, int donGiaNhap, int soLuongXuat) {
        this.id = id;
        this.soLuongNhap = soLuongNhap;
        this.donGiaNhap = donGiaNhap;
        this.soLuongXuat = soLuongXuat;
    }
    
    public String getId() {
        return id;
    }

    public int getSoLuongNhap() {
        return soLuongNhap;
    }

    public int getDonGiaNhap() {
        return donGiaNhap;
    }

    public int getSoLuongXuat() {
        return soLuongXuat;
    }
    
    public long getTongGiaTriNhap() {
        return this.soLuongNhap * this.donGiaNhap;
    }
    
    public long getTongGiaTriXuat() {
//       String loai = mh.getId().substring(0, 1);
       if (mh.getLoai().equals("A")) {
           return this.soLuongXuat * this.donGiaNhap * 108 / 100;
       }
       if (mh.getLoai().equals("B")) {
           return this.soLuongXuat * this.donGiaNhap * 105 / 100;
       }
       return this.soLuongXuat * this.donGiaNhap * 102 / 100;
    }
    
    public String toString() {
        return mh.getId() + " " + mh.getName() + " " + this.getTongGiaTriNhap() + " " + this.getTongGiaTriXuat();
    }
}
