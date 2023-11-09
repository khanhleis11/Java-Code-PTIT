package j05074;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr = new ArrayList<>();
//        HashMap<SinhVien, Integer> mp = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
//            mp.put(x, 10);
        }
        
        
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            int cc = 10;
            for (int j = 0; j < tmp[1].length(); j++) {
                if (tmp[1].charAt(j) == 'm') {
                    cc -= 1;
                } else if (tmp[1].charAt(j) == 'v') {
                    cc -= 2;
                } else {
                    cc -= 0;
                }
            }
            if (cc < 0) {
                cc = 0;
            }
            for (SinhVien sv : arr) {
                if (sv.getId().equals(tmp[0])) {
                    sv.setDiemChuyenCan(cc);
                }
            }
        }
        
        for (SinhVien x : arr) {
            System.out.println(x);
        }
    }
}
