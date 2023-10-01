package j04003;

public class PhanSo {
    private long tu, mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    
    public long ucln(long a, long b) {
        if (b == 0){
            return a;
        }
        return ucln(b, a % b);
    }
    
    public void RutGon() {
        long gcd = ucln(this.tu, this.mau);
        this.tu /= gcd;
        this.mau /= gcd;
    }
    
    public String toString() {
        return this.tu + "/" + this.mau;
    }
}
