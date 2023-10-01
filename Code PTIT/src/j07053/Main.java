package j07053;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<ThiSinh> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ThiSinh x = new ThiSinh(i + 1, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            arr.add(x);
        }
        for (ThiSinh x : arr) {
            System.out.println(x);
        }
    }
}
