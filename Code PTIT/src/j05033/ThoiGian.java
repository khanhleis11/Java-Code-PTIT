package j05033;

public class ThoiGian {
    private int gio, phut, giay;

    public ThoiGian(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public int getGio() {
        return gio;
    }

    public int getPhut() {
        return phut;
    }

    public int getGiay() {
        return giay;
    }
    
    public String toString() {
        return gio + " " + phut + " " + giay; 
    }
}
