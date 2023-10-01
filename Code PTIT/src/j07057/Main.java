package j07057;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<ThiSinh> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ThiSinh x = new ThiSinh(i + 1, sc.nextLine(), Double.parseDouble(sc.nextLine()), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<ThiSinh>() {
            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
                if (o1.getTongDiem() != o2.getTongDiem()) {
                    if (o1.getTongDiem() < o2.getTongDiem()) {
                        return 1;
                    }
                    return -1;
                } 
                return o1.getId().compareTo(o2.getId());
            }
            
        });
        for (ThiSinh x : arr) {
            System.out.println(x);
        }
    }
}
