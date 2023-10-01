import java.util.Scanner;

public class J01001 {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        if (x <= 0 || y <= 0) {
            System.out.println("0");
            return;
        }
        long p = 2 * (x + y);
        long s = x * y;
        System.out.println(p + " " + s);
    }
}
