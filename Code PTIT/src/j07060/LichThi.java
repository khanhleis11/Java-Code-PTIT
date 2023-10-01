package j07060;

import java.time.*;

public class LichThi implements Comparable<LichThi> {
    private MonThi mt;
    private CaThi ct;
    private String idNhom;
    private int soSinhVien;

    public LichThi(String idNhom, int soSinhVien) {
        this.idNhom = idNhom;
        this.soSinhVien = soSinhVien;
    }
    
    public LocalDate getDate() {
        String s = ct.getDate();
        String[] tmp = s.split("/");
        LocalDate x = LocalDate.of(Integer.valueOf(tmp[2]), Integer.valueOf(tmp[1]), Integer.valueOf(tmp[0]));
        return x;
    }
    
    public LocalTime getTime() {
        String s = ct.getTime();
        String[] tmp = s.split(":");
        LocalTime x = LocalTime.of(Integer.valueOf(tmp[0]), Integer.valueOf(tmp[1]));
        return x;
    }
    
    public void setMt(MonThi mt) {
        this.mt = mt;
    }

    public void setCt(CaThi ct) {
        this.ct = ct;
    }
    
    public String toString() {
        return ct.getDate() + " " + ct.getTime() + " " + ct.getRoom() + " " + mt.getTenMT() + " " + this.idNhom + " " + this.soSinhVien;
    }

    @Override
    public int compareTo(LichThi o) {
        if (this.getDate().equals(o.getDate())) {
            if (this.getTime().equals(o.getTime())) {
                return this.ct.getIdCT().compareTo(o.ct.getIdCT());
            }
            return this.getTime().compareTo(o.getTime());
        }
        return this.getDate().compareTo(o.getDate());
    }
}
