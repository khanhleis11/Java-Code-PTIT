import java.util.*;

public class J02037 {
    public static boolean check(String s){
        StringTokenizer st = new StringTokenizer(s);
        ArrayList<Integer> a = new ArrayList<Integer>();
        while (st.hasMoreTokens()){
            a.add(Integer.parseInt(st.nextToken()));
        }
        if (a.size() % 2 == 0){
            int cnt = 0;
            for (int x : a){
                if (x % 2 == 0){
                    cnt++;
                }
            }
            if (cnt > a.size() - cnt){
                return true;
            }
            return false;
        } else {
            int cnt = 0;
            for (int x : a){
                if (x % 2 != 0){
                    cnt++;
                }
            }
            if (cnt > a.size() - cnt){
                return true;
            }
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t --> 0){
            String s = sc.nextLine();
            if (check(s)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
