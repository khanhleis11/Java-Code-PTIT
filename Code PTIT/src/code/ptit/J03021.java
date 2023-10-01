import java.util.*;

public class J03021 {
    public static boolean check(String s){
        int n = s.length();
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
            s = s.toLowerCase();
            int n = s.length();
            String res = "";
            for (int i = 0; i < n; i++){
                if (s.charAt(i) == 'a' || s.charAt(i) == 'b' || s.charAt(i) == 'c'){
                    res += '2';
                }
                if (s.charAt(i) == 'd' || s.charAt(i) == 'e' || s.charAt(i) == 'f'){
                    res += '3';
                }
                if (s.charAt(i) == 'g' || s.charAt(i) == 'h' || s.charAt(i) == 'i'){
                    res += '4';
                }
                if (s.charAt(i) == 'j' || s.charAt(i) == 'k' || s.charAt(i) == 'l'){
                    res += '5';
                }
                if (s.charAt(i) == 'm' || s.charAt(i) == 'n' || s.charAt(i) == 'o'){
                    res += '6';
                }
                if (s.charAt(i) == 'p' || s.charAt(i) == 'q' || s.charAt(i) == 'r' || s.charAt(i) == 's'){
                    res += '7';
                }
                if (s.charAt(i) == 't' || s.charAt(i) == 'u' || s.charAt(i) == 'v'){
                    res += '8';
                }
                if (s.charAt(i) == 'w' || s.charAt(i) == 'x' || s.charAt(i) == 'y' || s.charAt(i) == 'z'){
                    res += '9';
                }
            }
            if (check(res)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
