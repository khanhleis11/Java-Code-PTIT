package j07060;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONTHI.in"));
        int n = Integer.parseInt(sc.nextLine());
        
        ArrayList<MonThi> arr1 = new ArrayList<>();
        ArrayList<CaThi> arr2 = new ArrayList<>();
        ArrayList<LichThi> arr3 = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            MonThi x = new MonThi(sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr1.add(x);
        }
        
        sc = new Scanner(new File("CATHI.in"));
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            CaThi x = new CaThi(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr2.add(x);
        }
        
        sc = new Scanner(new File("LICHTHI.in"));
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
//            System.out.println(tmp.length);
            String idCT = tmp[0];
            String idMT = tmp[1];
            LichThi x = new LichThi(tmp[2], Integer.valueOf(tmp[3]));
            for (MonThi mt : arr1) {
                if (mt.getIdMT().equals(idMT)) {
                    x.setMt(mt);
                }
            }
            for (CaThi ct : arr2) {
                if (ct.getIdCT().equals(idCT)) {
                    x.setCt(ct);
                }
            }
            arr3.add(x);
        }
        Collections.sort(arr3);
        for (LichThi x : arr3) {
            System.out.println(x);
        } 
    }
}
