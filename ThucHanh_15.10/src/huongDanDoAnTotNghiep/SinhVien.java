package huongDanDoAnTotNghiep;

public class SinhVien {
    private String id, name, className, email, sdt;

    public SinhVien(String id, String name, String className, String email, String sdt) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
        this.sdt = "0" + sdt;
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.className + " " + this.email + " " + this.sdt;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSdt() {
        return sdt;
    }
}

