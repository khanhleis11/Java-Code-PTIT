import java.util.*;

public class J03025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t --> 0) {
            String s = sc.nextLine();
            HashMap<Character, Integer> mp = new HashMap<>();
            for (char x : s.toCharArray()){
                if (mp.containsKey(x)) {
                    int tanSuat = mp.get(x);
                    tanSuat++;
                    mp.put(x, tanSuat);
                } else {
                    mp.put(x, 1);
                }
            }
            for (Map.Entry<Character, Integer> entry : mp.entrySet()){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
