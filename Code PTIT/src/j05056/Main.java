package j05056;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<VanDongVien> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            VanDongVien x = new VanDongVien(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }
        Collections.sort(arr);
        
        arr.get(0).setRank(1);
        for (int i = 1; i < n; i++) {
            if (arr.get(i).getThanhTichCuoiCung().equals(arr.get(i - 1).getThanhTichCuoiCung())) {
                arr.get(i).setRank(arr.get(i - 1).getRank());
            } else {
                arr.get(i).setRank(i + 1);
            }
        }
        for (VanDongVien x : arr) {
            System.out.println(x);
        }
    }
}

//3
//Nguyen Van Thanh
//20/03/1990
//07:00:00
//07:10:01
//Nguyen Hoa Binh
//01/10/1993
//07:02:00
//07:11:20
//Le Thanh Van
//15/03/1998
//07:05:00
//07:15:30