import java.util.*;

public class J01017 {
    public static boolean check(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (Math.abs(s.charAt(i + 1) - s.charAt(i)) != 1){
//                System.out.println(i);
//                System.out.println(s.charAt(i + 1) + " " + s.charAt(i));
//                System.out.print(s.charAt(i + 1) - s.charAt(i) + " ");
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t --> 0) {
            String s = sc.nextLine();
//            System.out.println(s);
            if (check(s)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
