import java.util.*;

public class J02025 {
    public static Integer[] a;
    public static int[] x;
    public static int n;
    
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
    
    public static void solve() {
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += (a[i] * x[i]);
        }
        if (isPrime(sum)){
            for (int i = 0; i < n; i++) {
                if (x[i] != 0) {
                    System.out.print(a[i] + " ");
                }
            }
            System.out.println("");
        }
    }
    
    public static void Try(int i) {
        for (int j = 0; j <= 1; j++){
            x[i] = j;
            if (i == n - 1){
                solve();
            } else {
                Try(i + 1);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            n = sc.nextInt();
            a = new Integer[n];
            x = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a, new Comparator<Integer>(){
                @Override
                public int compare(Integer o1, Integer o2) {
                    if (o1 > o2){
                        return -1;
                    } else {
                        return 1;
                    }
                }
            });
            Try(0);
//            for (int i = 0; i < n; i++){
//                System.out.print(a[i] + " ");
//            }
//            System.out.println("");
        }
    }
}
