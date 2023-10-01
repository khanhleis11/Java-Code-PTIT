import java.util.*;

public class J01012 {
    public static int solve(int n) {
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i % 2 == 0){
                    cnt++;
                }     
                int j = n / i;
                if (i != j){
                    if (n % j == 0) {
                        if (j % 2 == 0){
                            cnt++;
                        }
                    }
                }
                
            }
        }
        return cnt;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int n = sc.nextInt();
            System.out.println(solve(n));
        }
    }
}
