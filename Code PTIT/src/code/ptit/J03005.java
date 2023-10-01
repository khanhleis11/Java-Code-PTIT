import java.util.*;

public class J03005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t --> 0){
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            String res = "";
            while (st.hasMoreTokens()){
                res += (st.nextToken() + " ");
            }
            int n = res.length();
//            System.out.println(n);
            res = res.substring(0, n - 1);
            int flag = 0;
//            System.out.println(n);
            for (int i = 0; i < res.length(); i++){
                if (res.charAt(i) == ' '){
                    flag = i;
                    break;
                }
            }
            String firstName = res.substring(0, flag);
            firstName = firstName.toUpperCase();
            String lastName = res.substring(flag + 1, res.length());
            StringTokenizer st1 = new StringTokenizer(lastName);
            String en = "";
            while (st1.hasMoreTokens()){
                String tmp = st1.nextToken();
                String ans = "";
                ans += tmp.substring(0, 1).toUpperCase();
                ans += tmp.substring(1).toLowerCase();
                ans += " ";
                en += ans;
            }
            en = en.substring(0, en.length() - 1);
            System.out.println(en + ", " + firstName);
//            System.out.println(firstName);
//            System.out.println(firstName + " " + lastName);
        }
    }
}
