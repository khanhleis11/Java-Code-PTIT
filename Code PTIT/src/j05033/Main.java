package j05033;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ThoiGian> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ThoiGian x = new ThoiGian(sc.nextInt(), sc.nextInt(), sc.nextInt());
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<ThoiGian>() {
            @Override
            public int compare(ThoiGian o1, ThoiGian o2) {
                if (o1.getGio() != o2.getGio()) {
                    if (o1.getGio() < o2.getGio()) {
                        return -1;
                    } 
                    return 1;
                } else {
                    if (o1.getPhut() != o2.getPhut()) {
                        if (o1.getPhut() < o2.getPhut()) {
                            return -1;
                        }
                        return 1;
                    } else {
                        if (o1.getGiay() < o2.getGiay()) {
                            return -1;
                        }
                        return 1;
                    }
                }               
            }
        });
        for (ThoiGian x : arr) {
            System.out.println(x);
        }
    }
}
