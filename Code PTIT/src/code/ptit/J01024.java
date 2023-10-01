import java.util.*;

public class J01024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t --> 0) {
            String s = sc.nextLine();
            int flag = 1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '1' && s.charAt(i) != '2' && s.charAt(i) != '0'){
                    flag = 0;
                }
            }
            if (flag == 1){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
