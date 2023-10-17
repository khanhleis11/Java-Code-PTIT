package danhSachLienLac;

public class SinhVien implements Comparable<SinhVien> {
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

    @Override
    public int compareTo(SinhVien o) {
        if (this.className.equals(o.className)) {
            return this.id.compareTo(o.id);
        }
        return this.className.compareTo(o.className);
    }
}
