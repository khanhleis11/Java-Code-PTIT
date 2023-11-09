package bai4;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("INSTITUTION.in"));
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, String> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            String res = "";
            for (int j = 1; j < tmp.length; j++) {
                res += tmp[j] + " ";
            }
            res = res.trim();
            mp.put(tmp[0], res);
        }
        sc = new Scanner(new File("REGISTER.in"));
        n = Integer.parseInt(sc.nextLine());
        ArrayList<Team> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            int m = Integer.parseInt(tmp[1]);
            for (int j = 0; j < m; j++) {
                String name = sc.nextLine();
                Team x = new Team(name);
//                System.out.println(tmp[0]);
                x.setUni(mp.get(tmp[0]));
                arr.add(x);
            }
        }
        Collections.sort(arr);
        int cnt = 1;
        for (Team x : arr) {
            String id = "team" + String.format("%02d", cnt++);
            System.out.print(id + " ");
            System.out.print(x);
            System.out.println(x.getUni());
        }
    }
}
