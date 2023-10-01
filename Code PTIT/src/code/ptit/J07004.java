import java.util.*;
import java.io.*;

public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        while (sc.hasNextInt()){
            int tmp = sc.nextInt();
            if (mp.containsKey(tmp)){
                int tanSuat = mp.get(tmp);
                tanSuat++;
                mp.put(tmp, tanSuat);
            } else {
                mp.put(tmp, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
