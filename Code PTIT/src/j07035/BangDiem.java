package j07035;

public class BangDiem implements Comparable<BangDiem>{
    private SinhVien sv;
    private MonHoc mh;
    private String diem;
    
    public BangDiem(String diem) {
        this.diem = diem;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public void setMh(MonHoc mh) {
        this.mh = mh;
    }

    public MonHoc getMh() {
        return mh;
    }
    
    public String toString() {
        return sv.getIdSV() + " " + sv.getTenSV() + " " + sv.getClassName() + " " + this.diem;
    }

    @Override
    public int compareTo(BangDiem o) {
        double x = Double.valueOf(this.diem);
        double y = Double.valueOf(o.diem);
        if (x == y) {
            return this.sv.getIdSV().compareTo(o.sv.getIdSV());
        }
        if (x < y) {
            return 1;
        }
        return -1;
    }
}
