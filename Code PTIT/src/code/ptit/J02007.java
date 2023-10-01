import java.util.*;

public class J02007 {
    public static int[] cnt = new int[100005];
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> mp = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = 0;
        while (t --> 0) {   
//            System.out.println("");
            Arrays.fill(cnt, 0);
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
//                cnt[a[i]]++;
                mp.put(a[i], mp.getOrDefault(a[i], 0) + 1);
            }
            System.out.println("Test " + (++x) + ":");
            for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
                System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan");
            }
            mp.clear();
        }
    }
}
