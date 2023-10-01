package code.ptit;

import java.util.*;
import java.io.*;

public class J07011 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        HashMap<String, Integer> mp = new HashMap<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t --> 0) {
            String s = sc.nextLine();
            StringBuilder sb = new StringBuilder(s);
            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) == '.' || sb.charAt(i) == ',' || sb.charAt(i) == '?' || sb.charAt(i) == '!' || s.charAt(i) == ':' || s.charAt(i) == ';' || s.charAt(i) == '(' || s.charAt(i) == '-' || s.charAt(i) == '/') {
                    sb.replace(i, i + 1, " ");
                }
            }
            String res = sb.toString();
            StringTokenizer st = new StringTokenizer(res);
            while (st.hasMoreTokens()) {
                String tmp = st.nextToken().toLowerCase();
                if (mp.containsKey(tmp)) {
                    int tanSuat = mp.get(tmp);
                    tanSuat++;
                    mp.put(tmp, tanSuat);
                } else {
                    mp.put(tmp, 1);
                }
            }
        }
//        ArrayList<Map.Entry<String, Integer>> entryList = new ArrayList<>(mp.entrySet());
////        Collections.sort(entryList, Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()));
//        Collections.sort(entryList, Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()));
        
        // Convert the HashMap into a List of Map entries
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(mp.entrySet());

        // Define a custom comparator to sort entries by value in descending order,
        // and by key in ascending order when values are equal
        Comparator<Map.Entry<String, Integer>> customComparator = 
            Comparator.<Map.Entry<String, Integer>>comparingInt(entry -> entry.getValue())
            .reversed()
            .thenComparing(Map.Entry::getKey);

        // Sort the list using the custom comparator
        Collections.sort(entryList, customComparator);
        
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
