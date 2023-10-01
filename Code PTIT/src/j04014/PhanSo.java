package j04014;

public class PhanSo {
    private long tu, mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    

    public void setTu(long tu) {
        this.tu = tu;
    }

    public void setMau(long mau) {
        this.mau = mau;
    }

    public long getTu() {
        return tu;
    }

    public long getMau() {
        return mau;
    }
    
    public PhanSo() {
    }
    
    public long GCD(long a, long b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
    
    public long LCM(long a, long b) {
        long s = a * b;
        return s / GCD(a, b);
    }
    
    public PhanSo add(PhanSo a) {
        long bcnn = LCM(this.mau, a.mau);
        long tmp = this.tu * (bcnn / this.mau) + a.tu * (bcnn / a.mau);
        PhanSo res = new PhanSo();
        res.tu = tmp;
        res.mau = bcnn;
        long ucln = GCD(res.tu, res.mau);
        res.tu /= ucln;
        res.mau /= ucln;
        return res;
    }
    
    public PhanSo multiply(PhanSo a) {
        long Tu = this.tu * a.tu;
        long Mau = this.mau * a.mau;
        this.tu = Tu;
        this.mau = Mau;
        long ucln = GCD(this.tu, this.mau);
        this.tu /= ucln;
        this.mau /= ucln;
        return this;
    }
    
    public String toString() {
        return this.tu + "/" + this.mau;
    }
}
