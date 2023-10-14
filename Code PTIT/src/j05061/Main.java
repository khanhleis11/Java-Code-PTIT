package j05061;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<PhuHo> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            PhuHo x = new PhuHo(i + 1, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            arr.add(x);
        }
        Collections.sort(arr);
        for (PhuHo x : arr) {
            System.out.println(x);
        }
    }
}
