package j05064;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GiaoVien> arr = new ArrayList<>();
        
        HashMap<String, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            GiaoVien x = new GiaoVien(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            String chucVu = x.getChucVu();
            if (!mp.containsKey(chucVu)) {
                mp.put(chucVu, 1);
            } else {
                mp.replace(chucVu, mp.get(chucVu) + 1);
            }
            if (chucVu.equals("HT")) {
                if (mp.get(chucVu) <= 1)
                    arr.add(x);
            } else if (chucVu.equals("HP")) {
                if (mp.get(chucVu) <= 2)
                    arr.add(x);
            } else {
                arr.add(x);
            }
            
        }
        for (GiaoVien x : arr) {
            System.out.println(x);
        }
    }
}

//3
//GV01
//Nguyen Kim Loan
//1420000
//HT05
//Hoang Thanh Tuan
//1780000
//GV02
//Tran Binh Nguyen
//1468000