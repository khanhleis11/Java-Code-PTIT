import java.util.*;

public class J02022 {
    public static int n;
    public static boolean[] used = new boolean[11];
    public static int[] x = new int[11];
     
    public static void display() {
        for (int i = 1; i <= n; i++) {
            System.out.print(x[i]);
        }
        System.out.println("");
    }
    
    public static boolean check() {
        for (int i = 1; i <= n; i++) {
            if (x[i] == 0){
                return false;
            }
        }
        for (int i = 1; i < n; i++) {
            if (Math.abs(x[i + 1] - x[i]) == 1){
                return false;
            }
        }
        return true;
    }
    
    public static void Try(int i) {
        for (int j = 1; j <= n; j++) {
            if (used[j] == false) {
                used[j] = true;
                x[i] = j;
                if (i == n && check()) {
                    display();
                } else {
                    Try(i + 1);
                }
                used[j] = false;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            Arrays.fill(used, false);
            n = sc.nextInt();
            Try(1);
        }
    }
}
