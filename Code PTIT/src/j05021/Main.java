package j05021;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
        ArrayList<SinhVien> arr = new ArrayList<>();
        while (sc.hasNext()) {
//            String s = sc.nextLine();
//            if (s.isEmpty()) {
//                break;
//            }
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        for (SinhVien x : arr) {
            System.out.println(x);
        }
    }
    
}
