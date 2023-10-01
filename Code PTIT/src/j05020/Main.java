package j05020;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (!o1.getClassName().equals(o2.getClassName())) {
                    return o1.getClassName().compareTo(o2.getClassName());
                } else {
                    return o1.getId().compareTo(o2.getId());

                }
            }
        });
        for (SinhVien x : arr) {
            System.out.println(x);
        }
    }
    
}
