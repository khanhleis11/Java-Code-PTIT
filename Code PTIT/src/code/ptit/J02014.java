import java.util.Scanner;

public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt(); // Number of elements in the array
            int[] a = new int[n];
            
            // Read the array elements
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            // Calculate the total sum of the array
            int totalSum = 0;
            for (int num : a) {
                totalSum += num;
            }
            
            int leftSum = 0;
            for (int i = 0; i < n; i++) {
                totalSum -= a[i]; // Subtract the current element from the totalSum
                if (leftSum == totalSum) {
                    System.out.println(i + 1); // Equilibrium point found
                    break;
                }
                leftSum += a[i]; // Add the current element to the leftSum
            }
            
            if (leftSum != totalSum) {
                System.out.println(-1); // Equilibrium point not found
            }
        }
    }
}
