import java.util.*;
public class J01011 {
    public static int gcd(int a, int b) {
//        while (b != 0) {
//            int r = a % b;
//            a = b;
//            b = r;
//        }
//        return a;
        while (a != b){
            if (a > b){
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            long s = (long)a * b;
            System.out.println(s / gcd(a, b) + " " + gcd(a, b));
        }
    }
}
