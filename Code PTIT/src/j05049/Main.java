package j05049;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<MaHang> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            MaHang x = new MaHang(sc.nextLine(), Integer.parseInt(sc.nextLine()));
            arr.add(x);
        }
        String s = sc.nextLine();
        ArrayList<MaHang> res = new ArrayList<>();
        for (MaHang x : arr) {
            if (x.getId().substring(0, 1).equals(s)) {
                res.add(x);
            }
        }
        Collections.sort(res, new Comparator<MaHang>() {
            @Override
            public int compare(MaHang o1, MaHang o2) {
                if (o1.getThue() < o2.getThue()) {
                    return 1;
                }
                return -1;
            }
            
        });
        for (MaHang x : res){
            System.out.println(x);
        }
    }
}
