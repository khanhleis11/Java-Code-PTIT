
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class KiemTraNamNhuan {
    public static void main(String[] args) {
//        boolean check;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int year = sc.nextInt();
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
    //            check = true;
                System.out.println("YES");
            } else {
    //            check = false;
                System.out.println("NO");
            }
        }
    }
}
