package thuchanh_24.pkg9;

import java.io.*;
import java.util.*;

public class TestCase {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("AAAAA");
        arr1.add("BBBBB");
        
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("111");
        arr2.add("222");
        
        try {
            ObjectOutputStream out1 = new ObjectOutputStream(new FileOutputStream("DATA1.in"));
            out1.writeObject(arr1);
            out1.close();
            
            ObjectOutputStream out2 = new ObjectOutputStream(new FileOutputStream("DATA2.in"));
            out2.writeObject(arr2);
            out2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
    }
}
