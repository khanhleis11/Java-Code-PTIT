package j05026;

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
        int q = sc.nextInt();
        sc.nextLine();
        while (q --> 0) {
            String mon = sc.nextLine();
            String res = "";
            StringTokenizer st = new StringTokenizer(mon);
            while (st.hasMoreTokens()) {
                res += st.nextToken().substring(0, 1).toUpperCase();
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + res + ":");
            for (GiangVien x : arr) {
                
//                System.out.println(x.getSubject());
                if (x.getSubject().equals(res)) {
                    System.out.println(x);
                }
            }
        }
    }
}
