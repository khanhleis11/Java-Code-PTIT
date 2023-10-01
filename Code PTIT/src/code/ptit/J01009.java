
import java.util.Scanner;


public class J01009 {
    public static long TinhGiaiThua(int n) {
        long Tich = 1;
        for (int i = 1; i <= n; i++){
            Tich *= i;
        }
        return Tich;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s = 0;
        for (int i = 1; i <= n; i++){
            s += TinhGiaiThua(i);
        }
        System.out.println(s);
    }
}
