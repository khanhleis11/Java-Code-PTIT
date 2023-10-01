package j05027;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<GiangVien> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            GiangVien x = new GiangVien(i + 1, sc.nextLine(), sc.nextLine());
            x.ChuanHoaSub();
            arr.add(x);
        }
//        for (GiangVien x : arr) {
//            System.out.println(x);
//        }
        int q = sc.nextInt();
        sc.nextLine();
        while (q --> 0) {
           String s = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO  TU KHOA " + s + ":");
           s = s.toLowerCase();
           for (GiangVien x : arr) {
               String ten = x.getName().toLowerCase();
               int flag = 0;
               StringTokenizer st = new StringTokenizer(ten);
               while (st.hasMoreTokens()) {
                   String tmp = st.nextToken();
                   if (tmp.contains(s)) {
                       flag = 1;
                       break;
                   }
               } 
               if (flag == 1) {
                   System.out.println(x);
               }
           }
        }
    }
}
