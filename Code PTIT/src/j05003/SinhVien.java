package j05003;

//import java.util.*;

public class SinhVien {
    private String id, name, className, dob;
    private double gpa;

    public SinhVien(int id, String name, String className, String dob, double gpa) {
        this.id = "B20DCCN" + String.format("%03d", id);
        this.name = name;
        this.className = className;
        this.dob = dob;
        this.gpa = gpa;
    }
    
    public void ChuanHoaDob() {
//        String[] arr = this.dob.split("/");
        StringBuilder sb = new StringBuilder(this.dob);
        if (sb.charAt(1) == '/')  sb.insert(0, "0");
        if (sb.charAt(4) == '/')  sb.insert(3, "0");
        this.dob = sb.toString();  
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.className + " " + this.dob + " " + String.format("%.2f", this.gpa);
    }
}
