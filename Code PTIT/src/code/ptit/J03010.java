import java.util.*;

public class J03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        LinkedHashMap<String, Integer> mp = new LinkedHashMap<>();
        sc.nextLine();
        while (t --> 0){
            String s = sc.nextLine();
            s = s.toLowerCase();
            StringTokenizer st = new StringTokenizer(s);    
            String res = "";
            while (st.hasMoreTokens()){
                res += (st.nextToken() + " ");
            }
            res = res.substring(0, res.length() - 1);
            int flag = 0;
            for (int i = res.length() - 1; i >= 0; i--){
                if (res.charAt(i) == ' '){
                    flag = i;
                    break;
                }
            }
            String ans = "";
            String lastName = res.substring(flag + 1, res.length());
            ans += lastName;
            String firstName = res.substring(0, flag);
            StringTokenizer st1 = new StringTokenizer(firstName);
            while (st1.hasMoreTokens()){
                String tmp = st1.nextToken();
                ans += tmp.charAt(0);
            }
            if (!mp.containsKey(ans)){
                mp.put(ans, 1);
            } else {
                int tanSuat = mp.get(ans);
                tanSuat++;
                mp.put(ans, tanSuat);
            }
            if (mp.get(ans) == 1){
                System.out.println(ans + "@ptit.edu.vn");
            } else {
                System.out.println(ans + mp.get(ans) + "@ptit.edu.vn");
            }
        }
    }
}
