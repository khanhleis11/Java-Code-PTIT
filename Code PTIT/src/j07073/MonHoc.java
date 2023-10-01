package j07073;

public class MonHoc {
    private String id, name;
    private int soTin;
    private String lyThuyet, thucHanh;

    public MonHoc(String id, String name, int soTin, String lyThuyet, String thucHanh) {
        this.id = id;
        this.name = name;
        this.soTin = soTin;
        this.lyThuyet = lyThuyet;
        this.thucHanh = thucHanh;
    }

    public String getId() {
        return id;
    }
    
    public boolean check() {
        if (this.thucHanh.equals("Truc tuyen") || this.thucHanh.endsWith(".ptit.edu.vn")) {
            return true;
        }
        return false;
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.soTin + " " + this.lyThuyet + " " + this.thucHanh;
    }
}
