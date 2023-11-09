package j05077;

public class NhanVien {
    private String id, name, phongBan;
    private int luongCoBan, soNgay;

    public NhanVien(String id, String name, int luongCoBan, int soNgay) {
        this.id = id;
        this.name = name;
        this.luongCoBan = luongCoBan * 1000;
        this.soNgay = soNgay;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }
    
    public int getSoNamCongTac() {
        String s = this.id.substring(1, 3);
        return Integer.parseInt(s);
    }
    
    public int getHeSo() {
        String nhom = this.id.substring(0, 1);
        if (nhom.equals("A")) {
            if (this.getSoNamCongTac() >= 16) {
                return 20;
            }
            if (this.getSoNamCongTac() >= 9) {
                return 14;
            }
            if (this.getSoNamCongTac() >= 4) {
                return 12;
            }
            return 10;
        }
        if (nhom.equals("B")) {
            if (this.getSoNamCongTac() >= 16) {
                return 16;
            }
            if (this.getSoNamCongTac() >= 9) {
                return 13;
            }
            if (this.getSoNamCongTac() >= 4) {
                return 11;
            }
            return 10;
        }
        if (nhom.equals("C")) {
            if (this.getSoNamCongTac() >= 16) {
                return 14;
            }
            if (this.getSoNamCongTac() >= 9) {
                return 12;
            }
            if (this.getSoNamCongTac() >= 4) {
                return 10;
            }
            return 9;
        }
        if (this.getSoNamCongTac() >= 16) {
            return 13;
        }
        if (this.getSoNamCongTac() >= 9) {
            return 11;
        }
        if (this.getSoNamCongTac() >= 4) {
            return 9;
        }
        return 8;    
    }   
    
    public long getLuongThang() {
        return this.luongCoBan * this.soNgay * this.getHeSo();
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.phongBan + " " + this.getLuongThang();
    }
}
