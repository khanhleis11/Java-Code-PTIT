import java.util.*;

public class J03027 {
    public static boolean check(StringBuilder s){
        int n = s.length();
        for (int i = 0; i < n - 1; i++){
            if (s.charAt(i) == s.charAt(i + 1)){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        while (!check(sb)){
            for (int i = 0; i < sb.length() - 1; i++){
                if (sb.charAt(i) == sb.charAt(i + 1)){
                    sb.delete(i, i + 2);
                }
            }
        }
        s = sb.toString();
        if (s.isEmpty()){
            System.out.println("Empty String");
        } else {
            System.out.println(s);
        }
    }
}
