package j07071;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Name> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            Name x = new Name(s);
            arr.add(x);
        }
        Collections.sort(arr);
        int q = Integer.parseInt(sc.nextLine());
//        sc.nextLine();
        while (q --> 0) {
            String s = sc.nextLine();
            String res = "";
            for (char c : s.toCharArray()) {
                if (c != '.') {
                    res += c;
                }
            }
//            System.out.println(res);
            for (Name x : arr) {
                if (x.compare(res)) {
                    System.out.println(x);
//                    System.out.println("*");
                } 
            }
        }
    }
}
