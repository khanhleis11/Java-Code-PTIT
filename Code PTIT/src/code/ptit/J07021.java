import java.util.*;
import java.io.*;

public class J07021 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (true) {
            String s = sc.nextLine();
            if ("END".equals(s)){
                break;
            }
            StringTokenizer st = new StringTokenizer(s);
            String ans = "";
            while (st.hasMoreTokens()) {
                String tmp = st.nextToken();
                ans += (tmp.substring(0, 1).toUpperCase());
                ans += (tmp.substring(1).toLowerCase() + " ");
            }
            ans = ans.trim();
            System.out.println(ans);
        }
    }
}
