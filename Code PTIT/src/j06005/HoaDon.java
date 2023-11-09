package j06005;

public class HoaDon {
    private String idHD;
    private int soLuong;
    private KhachHang kh;
    private MatHang mh;

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public void setMh(MatHang mh) {
        this.mh = mh;
    }
    
    public HoaDon(int idHD, int soLuong) {
        this.idHD = "HD" + String.format("%03d", idHD);
        this.soLuong = soLuong;
    }
    
    public long getThanhTien() {
        return mh.getGiaBan() * this.soLuong;
    }
    
    public String toString() {
        return this.idHD + " " + kh.getTenKH() + " " + kh.getAdd() + " " + mh.getTenMH() + " " + mh.getDvt() + " " + mh.getGiaMua() + " " + mh.getGiaBan() + " " + this.soLuong + " " + this.getThanhTien();
    }
}
