package j04015;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiaoVien x = new GiaoVien(sc.nextLine(), sc.nextLine(), sc.nextLong());
        x.solve();
        System.out.println(x);
    }
}
