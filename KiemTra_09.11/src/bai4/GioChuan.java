package bai4;

public class GioChuan {
    private MonHoc mh;
    private GiangVien gv;
    private double gioChuan;

    public GioChuan(double gioChuan) {
        this.gioChuan = gioChuan;
    }

    public GiangVien getGv() {
        return gv;
    }

    public double getGioChuan() {
        return gioChuan;
    }

    public void setMh(MonHoc mh) {
        this.mh = mh;
    }

    public void setGv(GiangVien gv) {
        this.gv = gv;
    }
    
}
