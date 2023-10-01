import java.util.*;

public class J02024 {
    public static int n;
    public static int[] x;
    public static Integer[] a;
    public static TreeSet<String> se = new TreeSet<>();
    
    public static void check(){
        String res = "";
        long sum = 0;
        for (int i = 0; i < n; i++){
            sum += ((long)a[i] * x[i]);
        }
        if (sum % 2 != 0){
            for (int i = 0; i < n; i++){
                if (x[i] != 0){
                    System.out.print(a[i] + " ");
//                    res += (a[i].toString() + " ");
                }
                    
            }
            
//            se.add(res);
            System.out.println(res);
//            System.out.println("");
        }
    }
    
//    public static void display(){
//        for (int i = 0; i < n; i++){
//            System.out.print(a[i] + " ");
//        }
//        System.out.println("");
//    }
    
    public static void Try(int i) {
        for (int j = 0; j <= 1; j++){
            x[i] = j;
            if (i == n - 1){
                check();
            } else {
                Try(i + 1);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            n = sc.nextInt();
            a = new Integer[n];
            x = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a, new Comparator<Integer>(){
                @Override
                public int compare(Integer o1, Integer o2){
                    if (o1 > o2){
                        return -1;
                    } else {
                        return 1;
                    }
                }
            });
//            for (int i = 0; i < n; i++){
//                System.out.print(a[i] + " ");
//            }
//            System.out.println("");
            Try(0);
//            for (String x : se){
//                System.out.println(x);
//            }
//            se.clear();
            
        }
    }
}
