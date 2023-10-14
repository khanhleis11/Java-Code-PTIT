package j05069;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<CLB> arr1 = new ArrayList<>();
        ArrayList<TranDau> arr2 = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            CLB x = new CLB(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            arr1.add(x);
        }
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            TranDau x = new TranDau(tmp[0], Integer.parseInt(tmp[1]));
            String idCLB = tmp[0].substring(1, 3);
            for (CLB clb : arr1) {
                if (clb.getIdCLB().equals(idCLB)) {
                    x.setClb(clb);
                }
            }
            arr2.add(x);
        }
        for (TranDau x : arr2) {
            System.out.println(x);
        }
    }
}

//2
//AC
//AC Milan
//12
//MU
//Manchester United
//10
//2
//IAC1 80000
//EMU2 60000
//
//IAC1 AC Milan 960000
//EMU2 Manchester United 600000