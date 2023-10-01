import java.util.Scanner;

public class ProblemA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int x, y;
        x = a / b * b;
        y = (a / b + 1) * b;
//        if (a % b == 0) {
//            x = a / b * b;
//            y = (a / b + 1) * b;
//        } else {
//            
//        }
        System.out.println(x + " " + y);
    }
}
