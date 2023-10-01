import java.util.*;

public class J03028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        HashMap<Character, Integer> mp = new HashMap<>();
        ArrayList<Character> arr = new ArrayList<>();
        for (char i = 'A'; i <= 'Z'; i++){
            arr.add(i);
        }
        for (int i = 0; i <= 25; i++){
            mp.put(arr.get(i), i);
        }
//        for (Map.Entry<Character, Integer> entry : mp.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
        while (t --> 0) {
            String s = sc.next();
//            System.out.println(s);
            int n = s.length();
            String l = s.substring(0, n / 2);
            String r = s.substring(n / 2, n);
            int s1 = 0, s2 = 0;
            for (char x : l.toCharArray()){
                s1 += mp.get(x);
            }
            for (char x : r.toCharArray()){
                s2 += mp.get(x);
            }
            String res = "", ans = "";
            for (char x : l.toCharArray()){
                int tmp = mp.get(x) + s1;
                tmp %= 26;
                res += arr.get(tmp);
            }
            for (char x : r.toCharArray()){
                int tmp = mp.get(x) + s2;
                tmp %= 26;
                ans += arr.get(tmp);
            }
//            System.out.println(res + " " + ans);
            String x = "";
            for (int i = 0; i < res.length(); i++){
                int tmp = mp.get(res.charAt(i)) + mp.get(ans.charAt(i));
//                System.out.print(tmp + " ");
                tmp %= 26;
                x += arr.get(tmp);
            }
            System.out.println(x);
        }
    }
}
