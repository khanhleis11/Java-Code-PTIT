package baoHanhSanPham;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        
        ArrayList<SanPham> arr1 = new ArrayList<>();
        ArrayList<KhachHang> arr2 = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            SanPham x = new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            arr1.add(x);
        }
        
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            String add = sc.nextLine();
            String maSP = sc.nextLine();
            KhachHang x = new KhachHang(i + 1, ten, add, Integer.parseInt(sc.nextLine()), sc.nextLine());
            for (SanPham sp : arr1) {
                if (sp.getIdSP().equals(maSP)) {
                    x.setSp(sp);
                }
            }
            arr2.add(x);
        }
        Collections.sort(arr2);
        for (KhachHang x : arr2) {
            System.out.println(x);
        }
    }
}

//2
//KC740
//May khoan KC1
//39
//18
//KC742
//May cat KC2
//46
//12
//2
//Le Ngoc Long
//Hoang Mai
//KC740
//11
//21/05/2009
//Nguyen Sao Mai
//Hoan Kiem
//KC742
//17
//06/02/2009