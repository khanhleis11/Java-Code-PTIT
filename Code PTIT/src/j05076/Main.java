package j05076;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        
        ArrayList<MatHang> arr1 = new ArrayList<>();
        ArrayList<DonGia> arr2 = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            MatHang x = new MatHang(sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr1.add(x);
        }
        
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            DonGia x = new DonGia(tmp[0], Integer.parseInt(tmp[1]), Integer.parseInt(tmp[2]), Integer.parseInt(tmp[3]));
            for (MatHang mh : arr1) {
                if (tmp[0].equals(mh.getId())) {
                    x.setMh(mh);
                }
            }
            arr2.add(x);
        }
        for (DonGia x : arr2) {
            System.out.println(x);
        }
    }
}
