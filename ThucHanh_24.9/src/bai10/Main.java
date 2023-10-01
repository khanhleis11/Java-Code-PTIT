package bai10;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String tmp = sc.nextLine();
            String[] token = tmp.split("\\s+");
            SinhVien x = new SinhVien(name, Integer.valueOf(token[0]), Integer.valueOf(token[1]));
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getSoBaiDung() == o2.getSoBaiDung()) {
                    if (o1.getSoLuotSumbit() == o2.getSoLuotSumbit()) {
                        return o1.getName().compareTo(o2.getName());
                    }
                    return o1.getSoLuotSumbit() - o2.getSoLuotSumbit();
                }
                return o2.getSoBaiDung() - o1.getSoBaiDung();
            }
            
        });
        for (SinhVien x : arr) {
            System.out.println(x);
        }
    }
}
