package j06001;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        ArrayList<SanPham> arr1 = new ArrayList<>();
        ArrayList<HoaDon> arr2 = new ArrayList<>();
        
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            SanPham x;
            x = new SanPham(sc.nextLine().trim(), sc.nextLine().trim(), Long.parseLong(sc.nextLine().trim()), Long.parseLong(sc.nextLine().trim()));
            arr1.add(x);
        }

        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine().trim();
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