package j07084;

import java.time.Duration;
import java.time.LocalDateTime;

public class SinhVien implements Comparable<SinhVien> {
    private String name, tgBatDau, tgKetThuc;

    public SinhVien(String name, String tgBatDau, String tgKetThuc) {
        this.name = name;
        this.tgBatDau = tgBatDau;
        this.tgKetThuc = tgKetThuc;
    }
    
    public long getThoiGian() {
        String[] arr1 = this.tgBatDau.split("\\s+");
        String[] date1 = arr1[0].split("/");
        String[] time1 = arr1[1].split(":");
        LocalDateTime ldt1 = LocalDateTime.of(Integer.parseInt(date1[2]), Integer.parseInt(date1[1]), Integer.parseInt(date1[0]), Integer.parseInt(time1[0]), Integer.parseInt(time1[1]), Integer.parseInt(time1[2]));
        
        String[] arr2 = this.tgKetThuc.split("\\s+");
        String[] date2 = arr2[0].split("/");
        String[] time2 = arr2[1].split(":");
        LocalDateTime ldt2 = LocalDateTime.of(Integer.parseInt(date2[2]), Integer.parseInt(date2[1]), Integer.parseInt(date2[0]), Integer.parseInt(time2[0]), Integer.parseInt(time2[1]), Integer.parseInt(time2[2]));
        
        Duration duration = Duration.between(ldt1, ldt2);
        return duration.toMinutes();
    }
    
    public String toString() {
        return this.name + " " + this.getThoiGian();
    }

    @Override
    public int compareTo(SinhVien o) {
        if (this.getThoiGian() == o.getThoiGian()) {
            return this.name.compareTo(o.name);
        }
        if (this.getThoiGian() < o.getThoiGian()) {
            return 1;
        }
        return -1;
    }
}
