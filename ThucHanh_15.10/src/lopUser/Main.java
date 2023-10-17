package lopUser;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        
        LinkedHashMap<User, Integer> mp = new LinkedHashMap<>();
        ArrayList<User> arr = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            User x = new User(tmp[0], tmp[1]);
            arr.add(x);
            mp.put(x, 0);
        }
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            for (User x : arr) {
                if (x.getUsername().equals(tmp[0])) {
                    if (x.getPassword().equals(tmp[1])) {
                        mp.replace(x, mp.get(x) + 1);
                    }
                }
            }
        }
        for (Map.Entry<User, Integer> entry : mp.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
        System.out.println("");
    }
}
