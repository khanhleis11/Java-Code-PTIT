package j07059;

import java.time.*;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<CaThi> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            CaThi x = new CaThi(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<CaThi>() {
            @Override
            public int compare(CaThi o1, CaThi o2) {
                int dateComparison = o1.getDate().compareTo(o2.getDate());
                if (dateComparison != 0) {
                    return dateComparison;
                }
                
                int timeComparison = o1.getTime().compareTo(o2.getTime());
                if (timeComparison != 0) {
                    return timeComparison;
                }
                
                return o1.getId().compareTo(o2.getId());
            }
            
        });
        for (CaThi x : arr) {
            System.out.println(x);
        }
    }
}
