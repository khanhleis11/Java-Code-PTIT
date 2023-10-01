/*
3 loại set trong JAVA
1. HashSet (phần tử được sắp xếp theo thứ tự ngẫu nhiên)
2. LinkedHashSet (phần tử được sắp xếp trong thứ tự trong xuất hiện)
3. TreeSet (như C++)
*/

import java.util.*;

public class Set {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
//        LinkedHashSet<Integer> set = new LinkedHashSet<>();
//        int[] a = {2, 1, 3, 5, 10, 4, 2, 4, 1};
//        for (int x : a) {
//            set.add(x);
//        }
        set.add(100);
        set.add(400);
        set.add(300);
        set.add(100);
        set.add(200);
        set.add(400);
        set.add(500);
//        set1.add(Integer.SIZE)
        for (int x : set) {
            System.out.print(x + " ");
        }
    }
}
