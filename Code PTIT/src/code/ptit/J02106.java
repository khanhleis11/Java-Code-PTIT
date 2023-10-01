import java.util.*;

public class J02106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < 3; j++){
                if (a[i][j] == 1) {
                    cnt++;
                }
            }
            if (cnt > 1) {
                res++;
            }
        }
        System.out.println(res);
    }
}
