package j05055;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<VanDongVien> arr = new ArrayList<>();
        LinkedHashMap<VanDongVien, Integer> mp = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            VanDongVien x = new VanDongVien(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
            mp.put(x, i + 1);
        }
        Collections.sort(arr, new Comparator<VanDongVien>() {
            @Override
            public int compare(VanDongVien o1, VanDongVien o2) {
                String x = o1.getThanhTichCuoiCung();
                String y = o2.getThanhTichCuoiCung();
                String[] tmp1 = x.split(":");
                String[] tmp2 = y.split(":");
                if (tmp1[0].equals(tmp2[0])) {
                    if (tmp1[1].equals(tmp2[1])) {
                        return tmp1[2].compareTo(tmp2[2]);
                    }
                    return tmp1[1].compareTo(tmp2[1]);
                }
                return tmp1[0].compareTo(tmp2[0]);
            }
            
        });
        
        arr.get(0).setRank(1);
        for (int i = 1; i < n; i++) {
            if (arr.get(i).getThanhTichCuoiCung().equals(arr.get(i - 1).getThanhTichCuoiCung())) {
                arr.get(i).setRank(arr.get(i - 1).getRank());
            } else {
                arr.get(i).setRank(i + 1);
            }
        }
         
        for (VanDongVien x : arr) {
            mp.replace(x, x.getRank());
        }
        for (Map.Entry<VanDongVien, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey());
        }
        
    }
}
//
//3
//Nguyen Van Thanh
//20/03/1990
//07:00:00
//07:10:01
//Nguyen Hoa Binh
//01/10/1993
//07:02:00
//07:11:20
//Le Thanh Van
//15/03/1998
//07:05:00
//07:15:30
//
//VDV01 Nguyen Van Thanh 00:10:01 00:00:02 00:09:59 2
//VDV02 Nguyen Hoa Binh 00:09:20 00:00:02 00:09:18 1
//VDV03 Le Thanh Van 00:10:30 00:00:01 00:10:29 3