package j05018;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<HocSinh> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            HocSinh x = new HocSinh(i + 1, sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                if (o1.getDtb() != o2.getDtb()) {
                    if (o1.getDtb() < o2.getDtb()) {
                        return 1;
                    }
                    return -1;
                } else {
                    return o1.getId().compareTo(o2.getId());
                }
            }
            
        });
        for (HocSinh x : arr) {
            System.out.println(x);
        }
    }
}
