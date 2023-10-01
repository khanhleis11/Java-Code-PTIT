package j05035;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            SinhVien x = new SinhVien(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }
        int q = sc.nextInt();
        sc.nextLine();
        while (q --> 0) {
            String s = sc.nextLine();
            ArrayList<SinhVien> res = new ArrayList<>();
            for (SinhVien x : arr) {
                if (x.getDoanhNghiep().equals(s)) {
                    res.add(x);
                }
            }
            Collections.sort(res, new Comparator<SinhVien>() {
                @Override
                public int compare(SinhVien o1, SinhVien o2) {
                    return o1.getId().compareTo(o2.getId());
                }
                
            });
            for (SinhVien x : res) {
                System.out.println(x);
            }
        }
    }
}
