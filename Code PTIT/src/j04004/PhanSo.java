package j04004;

public class PhanSo {
    private long tu, mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public PhanSo() {
    }

    public long getTu() {
        return tu;
    }

    public long getMau() {
        return mau;
    }

    public long LCM(long a, long b) {
        long s = a * b;
        long tmp;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return s / a;
    }
    
    public long GCD(long a, long b) {
        long s = a * b;
        long tmp;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    
    public PhanSo add(PhanSo a) {
        long bcnn = LCM(a.mau, this.mau);
//        System.out.println(bcnn);
//        this.mau = bcnn;
//        System.out.println(this.mau);
//        System.out.println(this.tu + " " + this.mau);
        long tmp = this.tu * (bcnn / this.mau) + a.tu * (bcnn / a.mau);
//        System.out.println(this.tu + " " + this.mau + " " + bcnn + " " + a.mau + " " + a.tu);
        this.tu = tmp;
        this.mau = bcnn;
        long ucln = GCD(this.tu, this.mau);
        this.tu /= ucln;
        this.mau /= ucln;
//        System.out.println(this.tu + "/" + this.mau);
        return this;
    }
    
    public String toString() {
        return this.tu + "/" + this.mau;
    }
}
