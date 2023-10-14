package j05069;

public class TranDau {
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
}
