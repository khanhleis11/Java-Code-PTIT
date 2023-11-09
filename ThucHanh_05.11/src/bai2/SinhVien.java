package bai2;

import java.time.*;

public class SinhVien {
    private String name, tgBatDau, tgKetThuc;

    public SinhVien(String name, String tgBatDau, String tgKetThuc) {
        this.name = name;
        this.tgBatDau = tgBatDau;
        this.tgKetThuc = tgKetThuc;
    }

    public String getName() {
        return name;
    }
        
    public long getMinute() {
        String[] arr1 = this.tgBatDau.split("\\s+");
        String[] arr2 = this.tgKetThuc.split("\\s+");
        String l1 = arr1[0];
        String l2 = arr2[0];
//        System.out.println(l1 + " " + l2);
        String r1 = arr1[1];
        String r2 = arr2[1];
//        System.out.println(r1 + " " + r2);
        String[] arrL1 = l1.split("/");
        int d1 = Integer.valueOf(arrL1[0]), m1 = Integer.valueOf(arrL1[1]), y1 = Integer.valueOf(arrL1[2]);
        String[] arrR1 = r1.split(":");
        int h1 = Integer.valueOf(arrR1[0]), min1 = Integer.valueOf(arrR1[1]), s1 = Integer.valueOf(arrR1[2]);
        
        String[] arrL2 = l2.split("/");
        int d2 = Integer.valueOf(arrL2[0]), m2 = Integer.valueOf(arrL2[1]), y2 = Integer.valueOf(arrL2[2]);
        String[] arrR2 = r2.split(":");
        int h2 = Integer.valueOf(arrR2[0]), min2 = Integer.valueOf(arrR2[1]), s2 = Integer.valueOf(arrR2[2]);
        
        LocalDateTime time1 = LocalDateTime.of(y1, m1, d1, h1, min1, s1);
        LocalDateTime time2 = LocalDateTime.of(y2, m2, d2, h2, min2, s2);
        
//        System.out.println(y1 + " " + m1 + " " + d1 + " " + h1 + " " + min1 + " " + s1);
//        System.out.println(y2 + " " + m2 + " " + d2 + " " + h2 + " " + min2 + " " + s2);
        
        Duration duration = Duration.between(time1, time2);
        long minutes =  duration.toMinutes();
        return minutes;
    }
    
    public String toString() {
        return this.name + " " + this.getMinute();
    }
}
