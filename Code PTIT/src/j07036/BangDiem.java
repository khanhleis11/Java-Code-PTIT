package j07036;

public class BangDiem implements Comparable<BangDiem>{
    private SinhVien sv;
    private MonHoc mh;
    private String diem;

    public BangDiem(String diem) {
        this.diem = diem;
    }

    public SinhVien getSv() {
        return sv;
    }
    
    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public void setMh(MonHoc mh) {
        this.mh = mh;
    }
    
    public String toString() {
        return sv.getIdSV() + " " + sv.getTenSV() + " " + mh.getIdMH() + " " + mh.getTenMH() + " " + this.diem;
    }

    @Override
    public int compareTo(BangDiem o) {
        if (this.mh.getIdMH().equals(o.mh.getIdMH())) {
            return this.sv.getIdSV().compareTo(o.sv.getIdSV());
        }
        return this.mh.getIdMH().compareTo(o.mh.getIdMH());
    }
}
