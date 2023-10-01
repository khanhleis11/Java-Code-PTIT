import java.util.*;
import java.io.*;

public class J07008 {
    public static int[] a, x;
    public static int n;
    public static TreeSet<String> se = new TreeSet<>();
    
    public static boolean check(int[] a, int n){
        for (int i = 0; i < n - 1; i++){
            if (a[i + 1] <= a[i]){
                return false;
            }
        }
        return true;
    }
    
    public static void solve(){
        int cnt = 0;
        for (int i = 0; i < n; i++){
//            System.out.print(x[i] + " ");
            if (x[i] == 1){
                cnt++;
            }
        }
        int[] tmp = new int[cnt];
        int k = 0;
        for (int i = 0; i < n; i++){
            if (x[i] == 1){
                tmp[k] = a[i];
                k++;
            }
        }
        String res = "";
        if (check(tmp, cnt) && cnt > 1){
            for (int i = 0; i < cnt; i++){
                res += ("" + tmp[i] + " "); 
            }
//            System.out.println("");
        }
        if (res != ""){
            se.add(res);
        }
        
//        System.out.println("");
    }
    
    public static void Try(int i){
        for (int j = 0; j <= 1; j++){
            x[i] = j;
            if (i == n - 1){
                solve();
            } else {
                Try(i + 1);
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
//        File file = new File("D")
        Scanner sc = new Scanner(new File("DAYSO.in"));
//        ArrayList<Integer> arr = new ArrayList<>();
        n = sc.nextInt();
        sc.nextLine();
        int i = 0;
        a = new int[n];
        x = new int[n];
//        System.out.println(n);
        while (sc.hasNext()){
            int tmp = sc.nextInt();
            a[i] = tmp;
            i++;
        }
//        for (int x : a){
//            System.out.print(x + " ");
//        }
//        System.out.println("");
        Try(0);
        for (String x : se){
            System.out.println(x);
        }
    }
}
