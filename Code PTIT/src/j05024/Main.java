package j05024;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> arr = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }
//        for (SinhVien x : arr) {
//            System.out.println(x.getMajor());
//        }
        int q = sc.nextInt();
        sc.nextLine();
        while (q --> 0) {
            String major = sc.nextLine();
            major = major.toUpperCase();
            StringTokenizer st = new StringTokenizer(major);
            String res = "";
            while (st.hasMoreTokens()) {
                res += st.nextToken().substring(0, 1).toUpperCase();
            }
            res = res.substring(0, 2);
//            System.out.println(res);
            System.out.println("DANH SACH SINH VIEN NGANH " + major + ":");
            for (SinhVien x : arr) {
                String tmp = x.getMajor().substring(2, 4);
//                System.out.println(tmp);
                if (tmp.equals(res)) {
                    if ((tmp.equals("CN") || tmp.equals("AT")) && x.getClassName().charAt(0) == 'E') {
                        continue;
                    }
                    System.out.println(x);
                }
            }
        }
    }
}
