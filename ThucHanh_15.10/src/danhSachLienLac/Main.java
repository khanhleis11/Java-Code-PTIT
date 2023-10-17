package danhSachLienLac;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        
        ArrayList<SinhVien> arr = new ArrayList<>();
        while (sc.hasNextLine()) {
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }
        Collections.sort(arr);
        for (SinhVien x : arr) {
            System.out.println(x);
        }
    }
}

//B21DCCN123
//Tran Van Toan
//D21CQCN01-B
//toantv@gmail.com
//987654321
//B21DCCN111
//Ly Van Binh
//D21CQCN01-B
//binhlv@gmail.com
//978652142
//B21DCAT661
//Hoang Tam Anh
//D21CQAT01-B
//anhht@gmail.com
//966554321