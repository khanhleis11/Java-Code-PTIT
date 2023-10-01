package j04007;

public class NhanVien {
    private String id, name, sex, dob, add, mst, date;
    
    NhanVien(String id, String name, String sex, String dob, String add, String mst, String date) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.add = add;
        this.mst = mst;
        this.date = date;
    }
    
    public void display() {
        System.out.println(this.id + " " + this.name + " " + this.sex + " " + this.dob + " " + this.add + " " + this.mst + " " + this.date);
    }    
}
