package j04014;

import java.util.*;
        
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());
//            System.out.println(a);
            PhanSo c = a.add(b);
            c = c.multiply(c);
            System.out.println(c + " " + a.multiply(b.multiply(c)));
        }
    }
}
