package j05005;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            SinhVien x = new SinhVien(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            x.ChuanHoaDob();
            x.ChuanHoaTen();
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getGpa() < o2.getGpa()) {
                    return 1;
                }
                return -1;
            }
            
        });
        for (SinhVien x : arr) {
            System.out.println(x);
        }
    }
}
