package j04006;

public class SinhVien {
    private String id, name, lop, dob;
    private double gpa;
    
    SinhVien() {
        id = "";
        name = lop = dob = "";
        gpa = 0;
    }
    
    SinhVien(String ma, String ten, String lopSv, String birth, double diem){
        id = ma;
        name = ten;
        lop = lopSv;
        dob = birth;
        gpa = diem;
    }
    
    public void ChuanHoa() {
        String[] arr = dob.split("/");
        String ans = String.format("%02d", Integer.parseInt(arr[0])) + "/";
        ans += String.format("%02d", Integer.parseInt(arr[1])) + "/";
        ans += arr[2];
        dob = ans;
    }
    
    public void display() {
        System.out.print(id + " " + name + " " + lop + " " + dob + " ");
        System.out.printf("%.2f", gpa);
    }
}
