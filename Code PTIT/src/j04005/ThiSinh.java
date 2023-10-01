package j04005;

public class ThiSinh {
    private String id, name, dob;
    private double d1, d2, d3;
    
    ThiSinh(String ten, String birth, double diem1, double diem2, double diem3) {
        name = ten;
        dob = birth;
        d1 = diem1;
        d2 = diem2;
        d3 = diem3;
    }
    
    public void display() {
        System.out.print(name + " " + dob + " ");
        System.out.printf("%.1f", d1 + d2 + d3);
    }
}

