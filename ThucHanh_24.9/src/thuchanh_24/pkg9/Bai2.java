package thuchanh_24.pkg9;

import java.util.*;
import java.io.*;

public class Bai2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int t = sc.nextInt();
        while (t --> 0) {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int tmp = sc.nextInt();
                arr.add(tmp);
            }
            Collections.sort(arr);
            String l = "", r = "";
            for (int i = 0; i < arr.size(); i++) {
                if (i % 2 == 0) {
                    l += "" + arr.get(i);
                } else {
                    r += "" + arr.get(i);
                }
            }
            Long x = Long.parseLong(l);
            Long y = Long.parseLong(r);
            System.out.println(x + y);
        }
    }
}
