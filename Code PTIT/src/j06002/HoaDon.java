package j06002;

public class HoaDon implements Comparable<HoaDon>{
    private String idHD;
    private int soLuong;
    private static int cnt = 1;
    private SanPham sp;

    public HoaDon(String idHD, int soLuong) {
        this.idHD = idHD + "-" + String.format("%03d", cnt++);
        this.soLuong = soLuong;
    }

    public void setSp(SanPham sp) {
        this.sp = sp;
    }
    
    public long getThanhTien() {
        String loai = this.idHD.substring(2, 3);
//        System.out.println(loai);
        if (loai.equals("1")) {
            return this.soLuong * sp.getDonGia1();
        }
        return this.soLuong * sp.getDonGia2();
    }
    
    public long getGiamGia() {
        if (this.soLuong >= 150) {
            return this.getThanhTien() / 2;
        }
        if (this.soLuong >= 100) {
            return this.getThanhTien() * 3 / 10;
        }
        if (this.soLuong >= 50) {
            return this.getThanhTien() * 15 / 100;
        }
        return 0;
    }
    
    public long getPhaiTra() {
        return this.getThanhTien() - this.getGiamGia();
    }
    
    public String toString() {
        return this.idHD + " " + sp.getTenSP() + " " + this.getGiamGia() + " " + this.getPhaiTra();
    }

    @Override
    public int compareTo(HoaDon o) {
        if (this.getPhaiTra() < o.getPhaiTra()) {
            return 1;
        }
        return -1;
    }
}
