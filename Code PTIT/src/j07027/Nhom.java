package j07027;

public class Nhom implements Comparable<Nhom>{
    private SinhVien sv;
    private BaiTap bt;
    private String stt;
    
    public Nhom(String stt) {
        this.stt = stt;
    }

    public String getStt() {
        return stt;
    }
    
    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public void setBt(BaiTap bt) {
        this.bt = bt;
    }
    
    public String toString() {
        return sv.getIdSV() + " " + sv.getTenSV() + " " + sv.getSdt() + " " + this.stt;
    }

    @Override
    public int compareTo(Nhom o) {
        return this.sv.getIdSV().compareTo(o.sv.getIdSV());
    }
}
