package bai10;

public class SinhVien {
    private String name;
    private int soBaiDung, soLuotSumbit;

    public SinhVien(String name, int soBaiDung, int soLuotSumbit) {
        this.name = name;
        this.soBaiDung = soBaiDung;
        this.soLuotSumbit = soLuotSumbit;
    }

    public String getName() {
        return name;
    }

    public int getSoBaiDung() {
        return soBaiDung;
    }

    public int getSoLuotSumbit() {
        return soLuotSumbit;
    }
    
    public String toString() {
        return this.name + " " + this.soBaiDung + " " + this.soLuotSumbit;
    }
}
