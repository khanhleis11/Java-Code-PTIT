package j07048;

public class SanPham implements Comparable<SanPham>{
    private String id, name;
    private int giaBan, thoiGianBaoHanh;

    public SanPham(String id, String name, int giaBan, int thoiGianBaoHanh) {
        this.id = id;
        this.name = name;
        this.giaBan = giaBan;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

//    public String getId() {
//        return id;
//    }
//
//    public int getGiaBan() {
//        return giaBan;
//    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.giaBan + " "  + this.thoiGianBaoHanh;
    }
    
    public int compareTo(SanPham o) {
        if (this.giaBan != o.giaBan) {
            return o.giaBan - this.giaBan;
        } 
        return this.id.compareTo(o.id);
    }
}
