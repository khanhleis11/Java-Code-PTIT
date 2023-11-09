package j05075;

public class SinhVien {
    private String id, name, className;
    private int diemChuyenCan;

    public SinhVien(String id, String name, String className) {
        this.id = id;
        this.name = name;
        this.className = className;
//        this.diemChuyenCan = 10;
    }

    public String getClassName() {
        return className;
    }
    
    public String getId() {
        return id;
    }

    public void setDiemChuyenCan(int diemChuyenCan) {
        this.diemChuyenCan = diemChuyenCan;
    }
    
    public String getDieuKien() {
        if (this.diemChuyenCan == 0) {
            return "KDDK";
        }
        return "";
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.className + " " + this.diemChuyenCan + " " + this.getDieuKien();
    }
}
