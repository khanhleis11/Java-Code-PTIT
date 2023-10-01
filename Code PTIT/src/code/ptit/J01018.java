import java.util.*;

public class J01018 {
    public static boolean check(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += (s.charAt(i) - '0');
        }
        if (sum % 10 != 0) {
            return false;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (Math.abs(s.charAt(i) - s.charAt(i + 1)) != 2){
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
            if (check(s)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
