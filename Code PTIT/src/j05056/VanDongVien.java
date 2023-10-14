package j05056;

import java.time.*;

public class VanDongVien implements Comparable<VanDongVien>{
    private String id, name, dob, tgXuatPhat, tgDenDich;
    private int rank;
    private long duration;

    public VanDongVien(int id, String name, String dob, String tgXuatPhat, String tgDenDich) {
        this.id = "VDV" + String.format("%02d", id);
        this.name = name;
        this.dob = dob;
        this.tgXuatPhat = tgXuatPhat;
        this.tgDenDich = tgDenDich;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    
    public int getTuoi() {
        String[] arr = this.dob.split("/");
        return 2021 - Integer.parseInt(arr[2]);
    }
    
    public String getThanhTich() {
        String[] tmp1 = this.tgXuatPhat.split(":");
        String[] tmp2 = this.tgDenDich.split(":");
        
        LocalTime st = LocalTime.of(Integer.parseInt(tmp1[0]), Integer.parseInt(tmp1[1]), Integer.parseInt(tmp1[2]));
        LocalTime en = LocalTime.of(Integer.parseInt(tmp2[0]), Integer.parseInt(tmp2[1]), Integer.parseInt(tmp2[2]));
        
        Duration duration = Duration.between(st, en);
        long totalSeconds = duration.getSeconds();
        long h = totalSeconds / 3600;
        long m = (totalSeconds % 3600) / 60;
        long s = totalSeconds % 60;
        String res = String.format("%02d", h) + ":" + String.format("%02d", m) + ":" + String.format("%02d", s);
        return res;
    }
    
    public String getUuTien() {
        if (this.getTuoi() >= 32) {
            return "00:00:03";
        }
        if (this.getTuoi() >= 25) {
            return "00:00:02";
        }
        if (this.getTuoi() >= 18) {
            return "00:00:01";
        }
        return "00:00:00";
    }
    
    public String getThanhTichCuoiCung() {
        String[] tmp1 = this.getThanhTich().split(":");
        String[] tmp2 = this.getUuTien().split(":");
        
        LocalTime thanhTich = LocalTime.of(Integer.parseInt(tmp1[0]), Integer.parseInt(tmp1[1]), Integer.parseInt(tmp1[2]));
        LocalTime uuTien = LocalTime.of(Integer.parseInt(tmp2[0]), Integer.parseInt(tmp2[1]), Integer.parseInt(tmp2[2]));
        
        Duration duration = Duration.between(uuTien, thanhTich);
        long totalSeconds = duration.getSeconds();
        this.duration = totalSeconds;
        long h = totalSeconds / 3600;
        long m = (totalSeconds % 3600) / 60;
        long s = totalSeconds % 60;
        String res = String.format("%02d", h) + ":" + String.format("%02d", m) + ":" + String.format("%02d", s);
        return res;
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.getThanhTich() + " " + this.getUuTien() + " " + this.getThanhTichCuoiCung() + " " + this.rank;
    }

    @Override
    public int compareTo(VanDongVien o) {
        String[] tmp1 = this.getThanhTichCuoiCung().split(":");
        String[] tmp2 = o.getThanhTichCuoiCung().split(":");
        
        if (tmp1[0].equals(tmp2[0])) {
            if (tmp1[1].equals(tmp2[1])) {
                return tmp1[2].compareTo(tmp2[2]);
            }
            return tmp1[1].compareTo(tmp2[1]);
        }
        return tmp1[0].compareTo(tmp2[0]);
    }
}
