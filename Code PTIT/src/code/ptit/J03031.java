import java.util.*;

public class J03031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
//        sc.nextLine();
        while (t --> 0){
            HashSet<Character> se = new HashSet<Character>();
            sc.nextLine();
            String s = sc.nextLine();
            int k = sc.nextInt();
//            System.out.println(s);
            for (char x : s.toCharArray()){
                se.add(x);
            }
            if (se.size() + k >= 26){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
