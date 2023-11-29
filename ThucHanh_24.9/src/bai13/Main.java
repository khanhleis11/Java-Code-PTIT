package bai13;

//import java.io.File;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        HashSet<String> se = new HashSet<>();
        ArrayList<MonHoc> arr = new ArrayList<>();
        int cnt = 1;
        while (sc.hasNextLine()) {
            String ma = sc.nextLine();
            String y = sc.nextLine();
            String z = sc.nextLine();
            if (cnt == 1) {
                MonHoc x = new MonHoc(ma, y, z);
                arr.add(x);
            }
            if (!se.isEmpty()) {
                if (!se.contains(ma)) {
                    MonHoc x = new MonHoc(ma, y, z);
                    arr.add(x);
                }
            }  
            cnt++;
            se.add(ma);
        }
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
