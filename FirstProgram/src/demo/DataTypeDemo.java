package demo;

public class DataTypeDemo {
    public static void main(String[] args) {
        int x, y; 
        x = 8;
        y = x;
        long a;
        a = 7;
        double m = 6.8;
//        float th ì phải có f ở cuối 
        float k = 1.23f;
        System.out.println("Toi yeu Le Quoc Khanh!");
        System.out.println("a = " +a);
        boolean gender = true;
        System.out.println("Gioi tinh: "+(gender?"Nam":"Nu"));
        double diem = 8;
        if (diem >= 5){
            System.out.println("Len Lop");
        } else {
            System.out.println("Luu ban");
        }
//        System.out.println("Status: " +(diem>=5?"Len lop":"Luu ban"));
        int v = 8;
        v++;
        int x1 = 1;
//        System.out.println(i++);
        System.out.println("x1 = " + (x1 + 2));
//      Từ kiểu dữ liệu to xuống kiểu dữ liệu nhỏ thì phải ép kiểu
        long l = 12;
        int in = (int)l;
        double a1 = (double)1/2;
        System.out.println("a1 = " + a1);
    }
}
