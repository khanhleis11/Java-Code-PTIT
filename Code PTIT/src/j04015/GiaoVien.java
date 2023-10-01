package j04015;

public class GiaoVien {
    private String id, name;
    private long luongCoBan, bacLuong, phuCap, thuNhap;

    public GiaoVien(String id, String name, long luongCoBan) {
        this.id = id;
        this.name = name;
        this.luongCoBan = luongCoBan;
   
    }

    public String getId() {
        return id;
    }

    public long getLuongCoBan() {
        return luongCoBan;
    }
    
    public void solve() {
        String role = this.id.substring(0, 2);
        this.bacLuong = Integer.parseInt(this.id.substring(2, 4));
        if (role.equals("HT")) {
            this.phuCap = 2000000;
        } else if (role.equals("HP")) {
            this.phuCap = 900000;
        } else if (role.equals("GV")) {
            this.phuCap = 500000;
        }
        this.thuNhap = (this.luongCoBan * this.bacLuong + this.phuCap);
    }
    
    
    public String toString() {
        return this.id + " " + this.name + " " + this.bacLuong + " " + this.phuCap + " " + this.thuNhap;
    }
    
}
