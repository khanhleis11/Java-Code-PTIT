package j05054;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<HocSinh> arr = new ArrayList<>();
        LinkedHashMap<HocSinh, Integer> mp = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            HocSinh x = new HocSinh(i + 1, sc.nextLine(), Double.parseDouble(sc.nextLine()));
            arr.add(x);
            mp.put(x, i + 1);
        }
        
        Collections.sort(arr, new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                if (o1.getDtb() < o2.getDtb()) {
                    return 1;
                }
                return -1;
            }
            
        });
        
//        int cnt = 1;
        arr.get(0).setRank(1);
        for (int i = 1; i < n; i++) {
            if (arr.get(i).getDtb() == arr.get(i - 1).getDtb()) {
                arr.get(i).setRank(arr.get(i - 1).getRank());
//                arr.get(i).setRank(i);
            } else {
                arr.get(i).setRank(i + 1);
            }
        }
        
        for (HocSinh x : arr) {
            mp.replace(x, x.getRank());
        }
        for (Map.Entry<HocSinh, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}

//3
//Tran Minh Hieu
//5.9
//Nguyen Bao Trung
//8.6
//Le Hong Ha
//9.2

//HS01 Tran Minh Hieu 5.9 Trung Binh 3
//HS02 Nguyen Bao Trung 8.6 Kha  2
//HS03 Le Hong Ha 9.2 Gioi 1