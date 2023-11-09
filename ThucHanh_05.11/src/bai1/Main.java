package bai1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            ArrayList<Integer> arr1 = new ArrayList<>();
            ArrayList<Integer> arr2 = new ArrayList<>();
            HashSet<Integer> se1 = new HashSet<>();
            HashSet<Integer> se2 = new HashSet<>();
            int n = sc.nextInt();
    //        int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                int tmp = sc.nextInt();
                if (tmp % 2 == 0) {
                    se1.add(tmp);
                } else {
                    se2.add(tmp);
                }
            }
            for (int x : se1) {
                arr1.add(x);
            }
            for (int x : se2) {
                arr2.add(x);
            }
            Collections.sort(arr1);
            Collections.sort(arr2, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }

            });
            for (int x : arr1) {
                System.out.print(x + " ");
            }
            System.out.println("");
            for (int x : arr2) {
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }
}
