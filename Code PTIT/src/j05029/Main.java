package j05029;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<DoanhNghiep> arr = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            DoanhNghiep x = new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            arr.add(x);
        }
        int q = sc.nextInt();
        while (q --> 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + l + " DEN " + r + " SINH VIEN:");
            ArrayList<DoanhNghiep> res = new ArrayList<>();
            for (DoanhNghiep x : arr) {
                if (x.getSoSinhVien() >= l && x.getSoSinhVien() <= r) {
                    res.add(x);
                }
            }
            Collections.sort(res, new Comparator<DoanhNghiep>() {
                @Override
                public int compare(DoanhNghiep o1, DoanhNghiep o2) {
                    if (o1.getSoSinhVien() != o2.getSoSinhVien()) {
                        return o2.getSoSinhVien() - o1.getSoSinhVien();
                    } else {
                        return o1.getId().compareTo(o2.getId());
                    }

                }

            });
            for (DoanhNghiep x : res) {
                System.out.println(x);
            }
        }
        
    }
}
