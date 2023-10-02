package code.ptit;

import java.util.*;
import java.io.*;

public class HelloFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Hello.txt"));
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            System.out.println(s);
        }
    }
}
