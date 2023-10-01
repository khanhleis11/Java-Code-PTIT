package j05028;

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
        Collections.sort(arr, new Comparator<DoanhNghiep>() {
            @Override
            public int compare(DoanhNghiep o1, DoanhNghiep o2) {
                if (o1.getSoSinhVien() != o2.getSoSinhVien()) {
                    return o2.getSoSinhVien() - o1.getSoSinhVien();
                } else {
                    return o1.getId().compareTo(o2.getId());
                }
                
            }
            
        });
        for (DoanhNghiep x : arr) {
            System.out.println(x);
        }
    }
}
