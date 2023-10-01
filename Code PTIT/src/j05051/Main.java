package j05051;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<KhachHang> arr = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            KhachHang x = new KhachHang(i + 1, sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                if (o1.getTongTien() < o2.getTongTien()) {
                    return 1;
                }
                return -1;
            }
            
        });
        for (KhachHang x : arr) {
            System.out.println(x);
        }
    }
}
