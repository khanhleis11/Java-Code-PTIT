import java.util.*;

public class J03022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String s = sc.nextLine();
            if (s.isEmpty()){
                break;
            }
            String[] sentences = s.split("[.?!]");
            for (String x : sentences){
                x = x.trim();
//                System.out.println(x);
                StringTokenizer st = new StringTokenizer(x);
                int cnt = 0;
                String ans = "";
                while (st.hasMoreTokens()) {
                    String tmp = st.nextToken();
                    if (cnt == 0){
                        ans += (tmp.substring(0, 1).toUpperCase());
                        ans += (tmp.substring(1).toLowerCase() + " ");
                    } else {
                        ans += (tmp.toLowerCase() + " ");
                    }
                    cnt++;
                }
                System.out.println(ans + " ");
            }
        }
    }
}
