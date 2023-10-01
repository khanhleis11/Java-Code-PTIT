package thuchanh_24.pkg9;

import java.util.*;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        TreeSet<String> se1 = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            while (st.hasMoreTokens()) {
                String tmp = st.nextToken();
                se1.add(tmp.toLowerCase());
            }
        }
        int m = Integer.parseInt(sc.nextLine());
        TreeSet<String> se2 = new TreeSet<>();
        for (int i = 0; i < m; i++) {
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            while (st.hasMoreTokens()) {
                String tmp = st.nextToken();
                se2.add(tmp.toLowerCase());
            }
        }
        for (String x : se1) {
            if (!se2.contains(x)) {
                System.out.print(x + " ");
            }
            
        }
        System.out.println("");
        for (String x : se2) {
            if (!se1.contains(x)) {
                System.out.print(x + " ");
            }
            
        }
        System.out.println("");
    }
}
