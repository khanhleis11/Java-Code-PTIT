import java.util.*;
import java.util.ArrayList;

public class J02105 {
//    ArrayList<Integer>[] ke = new ArrayList[1005];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer>[] ke = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            ke[i] = new ArrayList<>();
        }
//        int[][] a = new int[n][n];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int tmp = sc.nextInt();
                if (tmp == 1) {
                    ke[i].add(j);
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.print("List(" + i + ") = ");
            for (int x : ke[i]){
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }
}
