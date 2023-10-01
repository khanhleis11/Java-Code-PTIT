package j05042;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        sc.nextLine();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextInt(), sc.nextInt());
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getBaiDung() != o2.getBaiDung()) {
                    return o2.getBaiDung() - o1.getBaiDung();
                } else {
                    if (o1.getBaiNop() != o2.getBaiNop()) {
                        return o1.getBaiNop() - o2.getBaiNop();
                    }
                }
                return o1.getName().compareTo(o2.getName());
            }
            
        });
        for (SinhVien x : arr) {
            System.out.println(x);
        }
    }
}
