import java.util.*;

public class J02027 {
    public static int lowerBound(long[] arr, int left, int right, long x) {
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
//            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; ++i) {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            long ans = 0;
            for (int i = 0; i < n; ++i) {
                ans += lowerBound(a, i + 1, n, a[i] + k) - (i + 1);
            }
            System.out.println(ans);
        }
    }
}
