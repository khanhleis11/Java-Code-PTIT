package j05070;

public class TranDau implements Comparable<TranDau> {
    private String idTranDau;
    private int soCdv;
    private CLB clb;
    
    public TranDau(String idTranDau, int soCdv) {
        this.idTranDau = idTranDau;
        this.soCdv = soCdv;
    }

    public void setClb(CLB clb) {
        this.clb = clb;
    }
    
    public long getDoanhThu() {
        return (long)this.soCdv * clb.getGiaVe();
    }
    
    public String toString() {
        return this.idTranDau + " " + clb.getTenCLB() + " " + this.getDoanhThu();
    }

    @Override
    public int compareTo(TranDau o) {
        if (this.getDoanhThu() != o.getDoanhThu()) {
            if (this.getDoanhThu() < o.getDoanhThu()) {
                return 1;
            }
            return -1;
        }
        return clb.getTenCLB().compareTo(clb.getTenCLB());
    }
}
