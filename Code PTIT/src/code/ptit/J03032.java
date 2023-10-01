import java.util.*;

public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t --> 0){
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            while (st.hasMoreTokens()){
                String tmp = st.nextToken();
                for (int i = tmp.length() - 1; i >= 0; i--){
                    System.out.print(tmp.charAt(i));
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
