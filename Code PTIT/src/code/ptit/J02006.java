import java.util.*; 

public class J02006 {
    public static int[] cnt = new int[2005];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            cnt[a[i]]++;
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            cnt[b[i]]++;
        }
        for (int i = 0; i <= 1000; i++) {
            if (cnt[i] > 0){
                System.out.print(i + " ");
            }
        }
//        System.out.println("");
    }
}
