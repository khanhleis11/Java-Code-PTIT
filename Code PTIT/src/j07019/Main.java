package j07019;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA1.in"));
        ArrayList<SanPham> arr1 = new ArrayList<>();
        ArrayList<HoaDon> arr2 = new ArrayList<>();
        
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            SanPham x;
            x = new SanPham(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            arr1.add(x);
        }
        sc = new Scanner(new File("DATA2.in"));
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] token = s.split("\\s+");
            HoaDon x = new HoaDon(token[0], Long.valueOf(token[1]));
            for (SanPham sp : arr1) {
                if (sp.getIdSP().equals(token[0].substring(0, 2))) {
                    x.setSanPham(sp);
                }
            }
            arr2.add(x);
        }
        
        for (HoaDon x : arr2) {
            System.out.println(x);
        }
    }
}