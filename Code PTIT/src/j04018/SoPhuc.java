package j04018;

public class SoPhuc {
    private int thuc, ao;

    public SoPhuc(int thuc, int ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

    public SoPhuc() {
    }
        
    public SoPhuc add(SoPhuc a) {
        SoPhuc res = new SoPhuc();
        res.thuc = this.thuc + a.thuc;
        res.ao = this.ao + a.ao;
        return res;
    }
    
    public SoPhuc mul(SoPhuc a) {
        SoPhuc res = new SoPhuc();
        res.thuc = this.thuc * a.thuc - this.ao * a.ao;
        res.ao = this.thuc * a.ao + this.ao * a.thuc;
        return res;
    }
    
    public String forMat() {
        if (this.ao < 0) {
            return this.thuc + " - " + this.ao * (-1) + "i"; 
        }
        return this.thuc + " + " + this.ao + "i";
    }
    
    public String toString() {
        return this.forMat();
    }
}
