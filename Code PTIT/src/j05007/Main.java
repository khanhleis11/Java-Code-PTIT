package j05007;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<NhanVien> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            NhanVien x = new NhanVien(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                if (o1.getYear() != o2.getYear()) {
                    return o1.getYear() - o2.getYear();
                } else {
                    if (o2.getMonth() != o2.getMonth()) {
                        return o1.getMonth() - o2.getMonth();
                    }
                    return o1.getDay() - o2.getDay();
                }
            }
            
        });
        for (NhanVien x : arr) {
            System.out.println(x);
//            System.out.println(x.getDay() + " " + x.getMonth() + " " + x.getYear());
        }
    }
}
