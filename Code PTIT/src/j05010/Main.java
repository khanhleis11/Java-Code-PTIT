package j05010;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<MatHang> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            MatHang x = new MatHang(i + 1, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1, MatHang o2) {
                if (o1.getLoiNhuan() < o2.getLoiNhuan()) {
                    return 1;
                }
                return -1;
            }  
        });
        for (MatHang x : arr) {
            System.out.println(x);
        }
    }
}
