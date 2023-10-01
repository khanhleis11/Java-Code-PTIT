package j05024;

public class SinhVien {
    private String id, name, className, email;

    public SinhVien(String id, String name, String className, String email) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
    }

    public String getClassName() {
        return this.className;
    }
    
    public String getMajor() {
        return this.id.substring(3, 7);
    }
        
    public String toString() {
        return this.id + " " + this.name + " " + this.className + " " + this.email;
    }
}
