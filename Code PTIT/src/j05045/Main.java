package j05045;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<NhanVien> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            NhanVien x = new NhanVien(i + 1, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            arr.add(x);
        }
//        String s = sc.nextLine();
        Collections.sort(arr, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                if (o1.getLuongChinh() != o2.getLuongChinh()) {
                    return o2.getLuongChinh() - o1.getLuongChinh();
                } 
                return o1.getId().compareTo(o2.getId());
            }
            
        });
        for (NhanVien x : arr) {
            System.out.println(x);
        }
    }
}
