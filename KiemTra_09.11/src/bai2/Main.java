package bai2;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<String> arr1 = (ArrayList<String>) in1.readObject();
        TreeSet<String> se1 = new TreeSet<>();
        for (String x : se1) {
            se1.add(x);
        }
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr2 = (ArrayList<Integer>) in2.readObject();
        TreeSet<Integer> se2 = new TreeSet<>();
        for (Integer x : se2) {
            se2.add(x);
        }
        TreeSet<String> res = new TreeSet<>();
//        ArrayList<String> res = new ArrayList<>();
        for (String x : se1) {
            for (Integer y : se2) {
                String tmp = x + y;
                res.add(tmp);
            }
        }
//        Collections.sort(res);
        for (String x : res) {
            System.out.println(x);
        }
//        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
//        
//        ArrayList<String> arr1 = (ArrayList<String>) in1.readObject();
//        ArrayList<String> arr2 = (ArrayList<String>) in1.readObject();
//        
//        TreeSet<String> se1 = new TreeSet<>();
//        for (String x : arr1) {
//            se1.add(x);
//        }
//        TreeSet<String> se2 = new TreeSet<>();
//        for (String x : arr2) {
//            se2.add(x);
//        }
//        
//        ArrayList<String> res1 = new ArrayList<>();
//        ArrayList<String> res2 = new ArrayList<>();
//        for (String x : se1) {
//            res1.add(x);
//        }
//        for (String x : se2) {
//            res2.add(x);
//        }
//        
//        TreeSet<String> ans = new TreeSet<>();
//        for (int i = 0; i < res1.size(); i++) {
//            for (int j = 0; j < res2.size(); j++) {
//                String tmp = res1.get(i) + res2.get(j);
//                ans.add(tmp);
//            }
//        }
//        
//        for (String x : ans) {
//            System.out.println(x);
//        }
    }
}
