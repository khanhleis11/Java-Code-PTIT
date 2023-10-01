import java.util.*;

public class J03004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t --> 0) {
            String s = sc.nextLine();
            String res = "";
            StringTokenizer st = new StringTokenizer(s);
            while (st.hasMoreTokens()){
                String ans = "";
                String tmp = st.nextToken();
                ans += tmp.substring(0, 1).toUpperCase();
                ans += tmp.substring(1).toLowerCase();
                res += (ans + " ");
            }
            int n = res.length();
            res = res.substring(0, n - 1);
            System.out.println(res);
        }
    }
}
