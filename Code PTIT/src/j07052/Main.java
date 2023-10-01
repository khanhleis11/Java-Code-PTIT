package j07052;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<ThiSinh> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ThiSinh x = new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            arr.add(x);
        }
        int chiTieu = sc.nextInt();
        Collections.sort(arr, new Comparator<ThiSinh>() {
            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
                if (o1.getDiem() != o2.getDiem()) {
                    if (o1.getDiem() < o2.getDiem()) {
                        return 1;
                    }
                    return -1;
                }
                return o1.getId().compareTo(o2.getId());
            }
            
        });
        
        double diemChuan = 0;
        if (arr.size() >= chiTieu) {
            diemChuan = arr.get(chiTieu - 1).getDiem();
        } else {
            diemChuan = arr.get(arr.size() - 1).getDiem();
        }
        
        System.out.printf("%.1f\n", diemChuan);
        for (ThiSinh x : arr) {
            if (x.getDiem() >= diemChuan) {
                System.out.println(x + " TRUNG TUYEN");
            } else {
                System.out.println(x + " TRUOT");
            }
        }
    }
}
