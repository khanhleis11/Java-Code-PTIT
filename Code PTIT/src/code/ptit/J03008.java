import java.util.*;

public class J03008 {
    public static boolean isPrime(int n){
        if (n < 2){
            return false;
        } 
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static boolean Check(String s){
        int n = s.length();
        for (int i = 0; i < n; i++){
            if (!isPrime(s.charAt(i) - '0')){
                return false;
            }
        }
        for (int i = 0; i < n; i++){
            if (s.charAt(i) != s.charAt(n - 1 - i)){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t --> 0){
            String s = sc.nextLine();
            if (Check(s)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
