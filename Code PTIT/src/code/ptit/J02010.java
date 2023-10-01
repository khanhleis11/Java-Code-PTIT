import java.util.*;

public class J02010 {
    public static void display(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
    
    public static void interchangeSort(int[] a, int n) {
        int cnt = 0;
        for (int i = 0; i < n - 1; i++) {
            int flag = 1;
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                    flag = 0;
                }
            }
            if (flag == 0) {
                System.out.print("Buoc " + ++cnt + ": ");
                display(a, n);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        interchangeSort(a, n);
    }
}
