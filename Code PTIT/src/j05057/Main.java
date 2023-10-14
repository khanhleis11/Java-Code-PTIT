package j05057;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ThiSinh x = new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            arr.add(x);
        }
        for (ThiSinh x : arr) {
            System.out.println(x);
        }
    }
}

//2
//KV2A002
//Hoang Thanh Tuan
//5
//6
//5
//KV2B123
//Ly Thi Thu Ha
//8
//6.5
//7

//KV2B123 Ly Thi Thu Ha 1 30.5 TRUNG TUYEN
//KV2A002 Hoang Thanh Tuan 1 22 TRUOT