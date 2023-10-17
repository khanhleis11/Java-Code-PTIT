package huongDanDoAnTotNghiep;

public class GiangVien implements Comparable<GiangVien>{
    private String name;
//    private int soDoAn;
    private String tenDoAn;
    private SinhVien sv;

    public GiangVien(String name, String tenDoAn) {
        this.name = name;
//        this.soDoAn = soDoAn;
        this.tenDoAn = tenDoAn;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }
    
    public String toString() {
        return sv.getId() + " " + sv.getName() + " " + this.name + " " + this.tenDoAn + " " + sv.getSdt();
    }

    @Override
    public int compareTo(GiangVien o) {
        return this.sv.getId().compareTo(o.sv.getId());
    }
}
