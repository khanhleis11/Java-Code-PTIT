package j07072;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<FullName> arr = new ArrayList<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            FullName x = new FullName(s);
            arr.add(x);
        }
        Collections.sort(arr);
        for (FullName x : arr) {
            System.out.println(x);
        }
    }
}
