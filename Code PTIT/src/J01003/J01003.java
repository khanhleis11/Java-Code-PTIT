//import java.util.Scanner;

import java.util.Scanner;
        
public class J01003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("VSN");
            } else {
                System.out.println("VN");
            }
        } else {
            System.out.printf("%.2f\n", -b / a);
//            System.out.println(-b / a);
        }
    }
}
