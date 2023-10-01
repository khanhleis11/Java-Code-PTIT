package j05042;

public class SinhVien {
    private String name;
    int baiDung, baiNop;

    public SinhVien(String name, int baiDung, int baiNop) {
        this.name = name;
        this.baiDung = baiDung;
        this.baiNop = baiNop;
    }

    public String getName() {
        return name;
    }

    public int getBaiDung() {
        return baiDung;
    }

    public int getBaiNop() {
        return baiNop;
    }
    
    public String toString() {
        return this.name + " " + this.baiDung + " " + this.baiNop;
    }
}
