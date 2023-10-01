package j04012;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien x = new NhanVien("NV01", sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine());
//        NhanVien x = new NhanVien("NV01", sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
        System.out.println(x);
    }
}
