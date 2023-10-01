import java.util.*;

public class J03040 {
    public static boolean check1(String s){
        int n = s.length();
        for (int i = 0; i < n; i++){
            if (s.charAt(i) != '6' && s.charAt(i) != '8'){
                return false;
            }
        }
        return true;
    }
    
    public static boolean check2(String s){
        int n = s.length();
        for (int i = 0; i < n - 1; i++){
            if (s.charAt(i + 1) <= s.charAt(i)){
                return false;
            }
        }
        return true;
    }
    
    public static boolean check3(String s){
        int n = s.length();
        for (int i = 0; i < n - 1; i++){
            if (s.charAt(i) != s.charAt(i + 1)){
                return false;
            }
        }
        return true;
    }
    
    public static boolean check4(String s){
        if (s.charAt(0) != s.charAt(1) && s.charAt(1) != s.charAt(2)){
            return false;
        }
        if (s.charAt(3) != s.charAt(4)){
            return false;
        }
        return true;
    }
    
    public static boolean check(String s){
        if (check1(s) || check2(s) || check3(s) || check4(s)){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t --> 0){
            String s = sc.nextLine();
//            System.out.println(s.length());
            String st = s.substring(5, 8);
            String en = s.substring(9, 11);
            s = st + en;
//            System.out.println(s);
            if (check(s)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
    }
}
