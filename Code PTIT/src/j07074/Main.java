package j07074;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        HashMap<String, MonHoc> mp = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            MonHoc x = new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            mp.put(x.getIdMH(), x);
        }
        
        sc = new Scanner(new File("LICHGD.in"));
        ArrayList<LichGiangDay> arr = new ArrayList<>();
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            LichGiangDay x = new LichGiangDay(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }
        Collections.sort(arr);
        
        String s = sc.nextLine();
        System.out.println("LICH GIANG DAY MON " + mp.get(s).getTenMH() + ":");
        for (LichGiangDay x : arr) {
            if (x.getIdMH().equals(s)) {
                System.out.println(x);
            }
        }
    }
}
