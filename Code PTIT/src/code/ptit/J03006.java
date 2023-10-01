import java.util.*;

public class J03006 {
    public static boolean Check(String s){
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) % 2 != 0){
                return false;
            }
        }
        int n = s.length();
        for (int i = 0; i < n; i++) {
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
        while (t --> 0) {
            String s = sc.nextLine();
            if (Check(s)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
