package j07020;

public class KhachHang {
    private String idKH, tenKH, gender, dob, add;

    public KhachHang(int idKH, String tenKH, String gender, String dob, String add) {
        this.idKH = "KH" + String.format("%03d", idKH);
        this.tenKH = tenKH;
        this.gender = gender;
        this.dob = dob;
        this.add = add;
    }

    public String getIdKH() {
        return idKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getGender() {
        return gender;
    }

    public String getDob() {
        return dob;
    }

    public String getAdd() {
        return add;
    }
}
