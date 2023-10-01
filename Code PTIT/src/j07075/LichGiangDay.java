package j07075;

public class LichGiangDay implements Comparable<LichGiangDay> {
    private String idMH, thu, kip, giangVien, phongHoc, idNhom;
    private String tenMH = "";
//    private static int cnt = 1;

    public LichGiangDay(int idNhom, String idMH, String thu, String kip, String giangVien, String phongHoc) {
        this.idNhom = "HP" + String.format("%03d", idNhom);
        this.idMH = idMH;
        this.thu = thu;
        this.kip = kip;
        this.giangVien = giangVien;
        this.phongHoc = phongHoc;
//        this.idNhom = idNhom;
    }

    public String getGiangVien() {
        return giangVien;
    }
    
    public String getIdMH() {
        return idMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }
    
    public String toString() {
        return this.idNhom + " " + this.tenMH + " " + this.thu + " " + this.kip + " " + this.phongHoc;
    }
    
    public int compareTo(LichGiangDay o) {
        if (this.thu.equals(o.thu)) {
            if (this.kip.equals(o.kip)){
                return this.giangVien.compareTo(o.giangVien);
            }
            return this.kip.compareTo(o.kip);
        }
        return this.thu.compareTo(o.thu);
    }
}