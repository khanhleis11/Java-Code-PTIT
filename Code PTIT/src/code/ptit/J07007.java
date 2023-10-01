import java.util.*;
import java.io.*;

public class J07007 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String> se = new TreeSet<>();
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            while (st.hasMoreTokens()){
                String tmp = st.nextToken();
                tmp = tmp.toLowerCase();
                se.add(tmp);
            }
        }
        for (String x : se) {
            System.out.println(x);
        }
    }
}
