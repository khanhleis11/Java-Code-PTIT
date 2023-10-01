import java.util.*;

public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t --> 0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            HashMap<String, Boolean> map = new HashMap<String, Boolean>();
            StringTokenizer st1 = new StringTokenizer(s1);
            while (st1.hasMoreTokens()){
                map.put(st1.nextToken(), true);
            }
//            System.out.println(map.size());
//            Set<Map.Entry<String, Boolean>> entrySet = map.entrySet();
//            var<Map.Entry>
//            var<Map.Entry<String, Boolean>> entrySet;
            
//            System.out.println(map.size());
            StringTokenizer st2 = new StringTokenizer(s2);
            while (st2.hasMoreTokens()){
                map.put(st2.nextToken(), false);
            }
            for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                if (entry.getValue() == true){
                    System.out.print(entry.getKey() + " ");
                }
            }
            System.out.println("");
        }
    }
}
