import java.util.*;

public class J03024 {
    public static String solve(String s){
        int n = s.length();
        for (int i = 0; i < n; i++){
            if (s.charAt(i) > '9' || s.charAt(i) < '0'){
                return "INVALID";
            }
        }
        if (n % 2 == 0){
            int cnt = 0;
            for (int i = 0; i < n; i++){
                if ((s.charAt(i) - '0') % 2 == 0){
                    cnt++;
                }
            }
            if (cnt > n - cnt){
                return "YES";
            } else {
                return "NO";
            }
        } else {
            int cnt = 0;
            for (int i = 0; i < n; i++){
                if ((s.charAt(i) - '0') % 2 != 0){
                    cnt++;
                }
            }
            if (cnt > n - cnt){
                return "YES";
            } else {
                return "NO";
            }
        }
//        System.out.println(n);
//        return "YES";
    }    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t --> 0){
            String s = sc.nextLine();
            System.out.println(solve(s));
        }
    }
}
