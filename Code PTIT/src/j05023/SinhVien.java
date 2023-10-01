package j05023;

public class SinhVien {
    private String id, name, className, email;

    public SinhVien(String id, String name, String className, String email) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
    }

    public String getYear() {
        return this.className.substring(1, 3);
    }
        
    public String toString() {
        return this.id + " " + this.name + " " + this.className + " " + this.email;
    }
}
