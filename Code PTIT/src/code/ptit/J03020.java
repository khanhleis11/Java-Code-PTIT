import java.util.*;

public class J03020{
    public static boolean check(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++){
//            System.out.println(s.charAt(i) + " " + s.charAt(n - 1 - i));
            if (s.charAt(i) != s.charAt(n - 1 - i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> mp = new LinkedHashMap<>();
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            if (s.isEmpty()){
                break;
            }
            StringTokenizer st = new StringTokenizer(s);
            while (st.hasMoreTokens()){
                String tmp = st.nextToken();
//                System.out.print(tmp + " ");
                if (check(tmp)){
                    if (mp.containsKey(tmp)){
                        int tanSuat = mp.get(tmp);
                        tanSuat++;
                        mp.put(tmp, tanSuat);
                    } else {
                        mp.put(tmp, 1);
                    }
                }
//                System.out.println("");
            }
        }
//        System.out.println(mp.size());
        int ans = 0;
        for (Map.Entry<String, Integer> entry : mp.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
            ans = Math.max(ans, entry.getKey().length());
        }
        for (Map.Entry<String, Integer> entry : mp.entrySet()){
            if (entry.getKey().length() == ans){
                System.out.println(entry.getKey() + " " + entry.getValue());
//                break;
            }
        }
    }
}