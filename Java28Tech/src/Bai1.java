
import java.util.Scanner;

// Math.method
// abs, sqrt, pow, min, max
// ceil: làm tròn lên
// floor: làm tròn xuống
// round: làm tròn chuẩn theo toán học

public class Bai1 {
    public static void main(String[] args) {
        int a;
        float f;
        String s;
        float PI = 3.141335F;
        long b = 41854859475908434L;
        System.out.println("Gia tri cua b la: " + b);
        System.out.println(PI);
        System.out.printf("%.2f\n", PI); // Cách in sau số thập phân bao nhiêu dấu phẩy
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println(a);
        f = sc.nextFloat();
        System.out.println(f);
    }
}
