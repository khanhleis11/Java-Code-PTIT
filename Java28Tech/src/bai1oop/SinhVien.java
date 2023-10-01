package bai1oop;

public class SinhVien {
    private String name;
    private String add;
    private String dob;
    private double gpa;
    
    SinhVien() {
        System.out.println("Constructor !");
    }

    public SinhVien(String name, String add, String dob, double gpa) {
        this.name = name;
        this.add = add;
        this.dob = dob;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
//    SinhVien(String ten, String diaChi, String birth, double diem) {
//        name = ten;
//        add = diaChi;
//        dob = birth;
//        gpa = diem;
//        System.out.println("Cam on bau Duc");
//    }
//    
    public void infor() {
        System.out.println(name + " " + add + " " + dob + " " + gpa);
    }
    
    public String toString() {
        return this.name + " " + this.add + " " + this.dob + " " + this.gpa;
    }
}
