import java.util.*;

public class J01006 {
//    Vector<Long> fibo = new Vector<>(93);
    public static long[] f = new long[93];
    public static void init() {
        f[0] = 0; 
        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i <= 92; i++){
            f[i] = f[i - 1] + f[i - 2];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        init();
        int t = sc.nextInt();
        while (t --> 0) {
            int n = sc.nextInt();
            System.out.println(f[n]);
//            for (int i = 0; i <= 92; i++){
//                System.out.println(f[i]);
//            }
//            System.out.println("");
        }
    }
}
