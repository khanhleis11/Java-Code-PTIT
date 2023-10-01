package j05081;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<MatHang> arr = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            MatHang x = new MatHang(i + 1, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1, MatHang o2) {
                if (o1.getLoiNhuan() != o2.getLoiNhuan()) {
                    return o2.getLoiNhuan() - o1.getLoiNhuan();
                } else {
                    return o1.getId().compareTo(o2.getId());
                }
            }
            
        });
        for (MatHang x : arr) {
            System.out.println(x);
        }
    }
}
