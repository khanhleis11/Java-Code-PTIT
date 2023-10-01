package fileExercise;

import java.util.*;
import java.io.*;

public class SoNguyenTo {
    public static boolean check(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("28tech_number.txt"));
//        FileWriter out = new FileWriter("28tech_prime.txt");
        FileWriter out = new FileWriter("28tech_prime.txt");
        ArrayList<Integer> arr = new ArrayList<>();
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
//            System.out.println(x);
            if (check(x)) {
                arr.add(x);
//                out.write(x + " ");
            }   
        }
        Collections.sort(arr);
        for (Integer x : arr){
                out.write(x + " ");
            }
        out.close();
    }
}
