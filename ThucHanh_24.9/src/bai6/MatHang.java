package bai6;

public class MatHang {
    private String name, id;
    private int donGia, soLuong;

    public MatHang(String name, String id, int donGia, int soLuong) {
        this.name = name;
        this.id = id;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    
    public String getSTT() {
        String tmp = this.id.substring(1, 4);
        return tmp;
    } 
    
    public int getGiamGia() {
        String ma = this.id.substring(4);
//        System.out.println(ma);
        if (ma.equals("2")) {
            return this.donGia * this.soLuong * 3 / 10;
        }
        return this.donGia * this.soLuong * 5 / 10; 
    }
    
    public int getThanhTien() {
        return this.donGia * this.soLuong - this.getGiamGia();
    }
    
    public String toString() {
        return this.name + " " + this.id + " " + this.getSTT() + " " + this.getGiamGia() + " " + this.getThanhTien();
    }
}
