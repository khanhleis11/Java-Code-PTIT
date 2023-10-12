package tapHopSoNguyen;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeSet<Integer> se1 = new TreeSet<>();
        TreeSet<Integer> se2 = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            se1.add(tmp);
        }
        for (int i = 0; i < m; i++) {
            int tmp = sc.nextInt();
            se2.add(tmp);
        }
        TreeSet<Integer> inter = new TreeSet<>();
        for (int x : se2) {
            if (se1.contains(x)) {
                inter.add(x);
            }
        }
        for (int x : inter) {
            System.out.print(x + " ");
        }
        System.out.println("");
        for (int x : se1) {
            if (!se2.contains(x)) {
                System.out.print(x + " ");
            }
        }
        System.out.println("");
        for (int x : se2) {
            if (!se1.contains(x)) {
                System.out.print(x + " ");
            }
        }
        System.out.println("");
    }
}
