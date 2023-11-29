package bai2;

import java.io.*;
import java.util.*;

public class Bai2 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<String> arr1 = (ArrayList<String>) in1.readObject();
        Set<String> se1 = new TreeSet<>();
        for (String x : arr1) {
            se1.add(x);
        }
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr2 = (ArrayList<Integer>) in2.readObject();
        Set<Integer> se2 = new TreeSet<>();
        for (Integer x : arr2) {
            se2.add(x);
        }
        List<String> res = new ArrayList<>();
        for (String x : se1) {
            for (Integer y : se2) {
                String tmp = x + y;
                res.add(tmp);
            }
        }
        Collections.sort(res);
        for (String x : res) {
            System.out.println(x);
        }
    }
}
