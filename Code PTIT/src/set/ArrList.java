import java.util.*;

/*
Các hàm với Array List
 add, clear, isEmpty, contains, remove(, toArray, indexOf
 forEach
*/

public class ArrList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> res = new ArrayList<>();
//        int n = sc.nextInt();
        int[] a = {1, 5, 4, 3, 2, 1};
        for (int x : a) {
            res.add(x);
        }
        Collections.sort(res);
        
//        System.out.println("");
        System.out.println(res.isEmpty());
        System.out.println(res.contains(1));
        res.remove(1);
        res.remove((Object)(4));
        for (int x : res){
            System.out.print(x + " ");
        }
        System.out.println("");
    }
}
