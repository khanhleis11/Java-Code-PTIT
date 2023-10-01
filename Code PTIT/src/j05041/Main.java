package j05041;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<NhanVien> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            NhanVien x = new NhanVien(i + 1, sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()), sc.nextLine());
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                if (o1.getThucLinh() < o2.getThucLinh()) {
                    return 1;
                }
                return -1;
            }
            
        });
        for (NhanVien x : arr) {
            System.out.println(x);
        }
//        System.out.println("Tong chi phi tien luong: " + ans);
    }
}
