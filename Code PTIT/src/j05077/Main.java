package j05077;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            NhanVien x = new NhanVien(id, sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            String res = id.substring(3, 5);
            x.setPhongBan(mp.get(res));
            arr.add(x);
        }
        for (NhanVien x : arr) {
            System.out.println(x);
        }
    }
}
