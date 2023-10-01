package j05009;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<ThiSinh> arr = new ArrayList<ThiSinh>();
        for (int i = 0; i < n; i++) {
            ThiSinh x = new ThiSinh(i + 1, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            arr.add(x);
        }
        ArrayList<ThiSinh> ans = new ArrayList<ThiSinh>();
        double tmp = 0;
        for (ThiSinh x : arr) {
            tmp = Math.max(tmp, x.getTongDiem());
        }
        for (ThiSinh x : arr) {
            if (x.getTongDiem() == tmp) {
                ans.add(x);
            }
        }
        Collections.sort(ans, new Comparator<ThiSinh>() {
            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        for (ThiSinh x : ans) {
            System.out.println(x);
        }
    }
}
