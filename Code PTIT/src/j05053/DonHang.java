package j05053;

public class DonHang implements Comparable<DonHang>{
    private String name, id;
    private int donGia, soLuong;

    public DonHang(String name, String id, int donGia, int soLuong) {
        this.name = name;
        this.id = id;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    
    public String getSTT() {
        String tmp = this.id.substring(1, 4);
        return tmp;
    } 
    
    public double getGiamGia() {
        String loai = this.id.substring(4, 5);
        if (loai.equals("1")) {
            return this.donGia * this.soLuong / 2;
        }
        return this.donGia * this.soLuong * 3 / 10;
    }
    
    public double getThanhTien() {
        return this.donGia * this.soLuong - this.getGiamGia();
    }
    
    public String toString() {
        return this.name + " " + this.id + " " + this.getSTT() + " " + String.format("%.0f", this.getGiamGia()) + " " + String.format("%.0f", this.getThanhTien());
    }

    @Override
    public int compareTo(DonHang o) {
        return this.getSTT().compareTo(o.getSTT());
    }
}
