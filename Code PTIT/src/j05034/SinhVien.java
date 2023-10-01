package j05034;

public class SinhVien {
    private int stt;
    private String id, name, className, email, doanhNghiep;

    public SinhVien(int stt, String id, String name, String className, String email, String doanhNghiep) {
        this.stt = stt;
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
        this.doanhNghiep = doanhNghiep;
    }

    public String getName() {
        return name;
    }

    public String getDoanhNghiep() {
        return doanhNghiep;
    }
    
    public String toString() {
        return this.stt + " " + this.id + " " + this.name + " " + this.className + " " + this.email + " " + this.doanhNghiep;
    }
}
