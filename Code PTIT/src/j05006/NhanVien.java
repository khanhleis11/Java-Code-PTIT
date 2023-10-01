package j05006;

public class NhanVien {
    private String id, name, gender, dob, add, mst, date;

    public NhanVien(int id, String name, String gender, String dob, String add, String mst, String date) {
        this.id = String.format("%05d", id);
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.add = add;
        this.mst = mst;
        this.date = date;
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.gender + " " + this.dob + " " + this.add + " " + this.mst + " " + this.date;
    }
}
