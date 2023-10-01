import java.util.*;

public class J03026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0){
            String x = sc.next();
            String y = sc.next();
            if (x.equals(y)){
                System.out.println("-1");
            } else {
                System.out.println(Math.max(x.length(), y.length()));
            }
        }
    }
}
