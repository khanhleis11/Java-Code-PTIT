import java.util.*;

public class J02011 {
    public static void display(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    public static void insertionSort(int[] a, int n) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int x = a[i], pos = i - 1;
            while (pos >= 0 && x < a[pos]) {
                a[pos + 1] = a[pos];
                pos--;
            }
            a[pos + 1] = x;
            System.out.print("Buoc " + (cnt++) + ": ");
            for (int j = 0; j <= i; j++){
                System.out.print(a[j] + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        insertionSort(a, n);
    }
}
