package j07075;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        HashMap<String, MonHoc> mp = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            MonHoc x = new MonHoc(sc.nextLine().trim(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
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
        
//        for (Map.Entry<String, MonHoc> entry : mp.entrySet()) {
//            System.out.println(entry.getKey());
//        }
        
        String s = sc.nextLine();
        System.out.println("LICH GIANG DAY GIANG VIEN " + s + ":");
        for (LichGiangDay x : arr) {
            if (x.getGiangVien().equals(s)) {
                String tmp = x.getIdMH().trim();
//                System.out.println(tmp);
                if (mp.containsKey(tmp)) {
//                    System.out.println(mp.get(tmp).getTenMH());
                    x.setTenMH(mp.get(tmp).getTenMH());
                }
                System.out.println(x);
            }
        }
        
        
    }
}
