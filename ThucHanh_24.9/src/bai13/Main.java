package bai13;

//import java.io.File;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        HashSet<String> se = new HashSet<>();
        ArrayList<MonHoc> arr = new ArrayList<>();
//        int t = 4;
        int cnt = 1;
        while (sc.hasNextLine()) {
            String ma = sc.nextLine();
            String y = sc.nextLine();
            String z = sc.nextLine();
//            System.out.println("*");
//            for (String x : se) {
//                System.out.println(x);
//            }
            if (cnt == 1) {
                MonHoc x = new MonHoc(ma, y, z);
                arr.add(x);
            }
            if (!se.isEmpty()) {
//                System.out.println("*");
                if (!se.contains(ma)) {
                    MonHoc x = new MonHoc(ma, y, z);
                    arr.add(x);
                }
            }  
            cnt++;
            se.add(ma);
        }
//        System.out.println(arr.size());
        Collections.sort(arr, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.getId().compareTo(o2.getId());
            }
            
        });
        for (MonHoc x : arr) {
            System.out.println(x);
        }
    }
}
