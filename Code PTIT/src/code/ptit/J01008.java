import java.util.Scanner;

public class J01008 {
    public static void solve(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++){
            int dem = 0;
            while (n % i == 0){
                n /= i;
                dem++;
            }
            if (dem != 0){
                System.out.print(i + "(" + dem + ") ");
            }
        }
        if (n != 1){
            System.out.print(n + "(1)");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cnt = 1;
        while (t --> 0) {
            int n = sc.nextInt();
            System.out.print("Test " + cnt++ + ": " );
            solve(n);
        }
    }
}
