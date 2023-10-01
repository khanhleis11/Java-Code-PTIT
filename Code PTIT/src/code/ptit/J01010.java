import java.util.*;

public class J01010 {
    public static String check(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0'){
                res += '0';
            } else if (s.charAt(i) == '1') {
                res += '1';
            }  else if (s.charAt(i) == '8') {
                res += '0';
            }  else if (s.charAt(i) == '9') {
                res += '0';
            } else {
                return "INVALID";
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t --> 0) {
            String s = sc.nextLine();
//            System.out.println(s);
//            System.out.println(s.length());
//            System.out.println(check(s));
            String ans = check(s);
            if (ans != "INVALID"){
                long res = Long.parseLong(ans);
                if (res == 0) {
                    System.out.println("INVALID");
                } else {
                    System.out.println(Long.parseLong(ans));
                }
            } else {
                System.out.println("INVALID");
            }
        }
    }
}
