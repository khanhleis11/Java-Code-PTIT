package j07020;

public class HoaDon {
    private String idHD, idKH, idMH;
    private KhachHang kh;
    private MatHang mh;
    private int soLuong;

    public HoaDon(int idHD, String idKH, String idMH, int soLuong) {
        this.idHD = "HD" + String.format("%03d", idHD);
        this.idKH = idKH;
        this.idMH = idMH;
        this.soLuong = soLuong;
    }
    
    public long getThanhTien() {
        return mh.getGiaBan() * this.soLuong;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public void setMh(MatHang mh) {
        this.mh = mh;
    }
    
    public String toString() {
        return this.idHD + " " + kh.getTenKH() + " " + kh.getAdd() + " " + mh.getTenMH() + " " + mh.getDvt() + " " + mh.getGiaMua()
               + " " + mh.getGiaBan() + " " + this.soLuong + " " + this.getThanhTien();
    }
}
