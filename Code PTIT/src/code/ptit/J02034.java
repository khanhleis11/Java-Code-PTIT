import java.util.*;

public class J02034 {
    public static int[] cnt = new int[205];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        TreeMap<Integer, Boolean> mp = new TreeMap<>();
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            cnt[a[i]]++;
        }
        int max = a[n - 1], flag = 0;
        for (int i = 1; i <= max; i++) {
            if (cnt[i] == 0) {
                System.out.println(i);
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("Excellent!");
        }
    }
}
