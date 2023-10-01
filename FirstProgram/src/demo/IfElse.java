
package demo;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class IfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                while (s1.length() < 15){
                    s1 = s1 + " ";
                }
                String tmp = String.valueOf(x);
                // System.out.println(tmp);
                while (tmp.length() < 3){
                    tmp = "0" + tmp;
                }
                System.out.println(s1 + tmp);
            }
            System.out.println("================================");

    }
}
