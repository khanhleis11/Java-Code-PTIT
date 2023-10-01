package j05025;

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
        Collections.sort(arr, new Comparator<GiangVien>() {
            @Override
            public int compare(GiangVien o1, GiangVien o2) {
                if (!o1.getLastName().equals(o2.getLastName())) {
                    return o1.getLastName().compareTo(o2.getLastName());
                } else {
                    return o1.getId().compareTo(o2.getId());
                }
            }
            
        });
        for (GiangVien x : arr) {
//            System.out.println(x.getLastName());
            System.out.println(x);
        }
    }
}
