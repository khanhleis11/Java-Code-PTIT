package j05061;

public class PhuHo implements Comparable<PhuHo> {
    private String id, name, dob;
    private double diemLyThuyet, diemThucHanh;

    public PhuHo(int id, String name, String dob, double diemLyThuyet, double diemThucHanh) {
        this.id = "PH" + String.format("%02d", id);
        this.name = name;
        this.dob = dob;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
    }
    
    public double getDiemThuong() {
        if (this.diemLyThuyet >= 8 && this.diemThucHanh >= 8) {
            return 1;
        }
        if (this.diemLyThuyet >= 7.5 && this.diemThucHanh >= 7.5) {
            return 0.5;
        }
        return 0;
    }
    
    public double getDiemXepLoai() {
        double tmp = (this.diemLyThuyet + this.diemThucHanh) / 2 + this.getDiemThuong();
        if (tmp > 10) {
            return 10;
        }
        return Math.round(tmp);
    }
    
    public String getXepLoai() {
        if (this.getDiemXepLoai() >= 9) {
            return "Xuat sac";
        }
        if (this.getDiemXepLoai() >= 8) {
            return "Gioi";
        }
        if (this.getDiemXepLoai() >= 7) {
            return "Kha";
        }
        if (this.getDiemXepLoai() >= 5) {
            return "Trung binh";
        }
        return "Truot";
    }
    
    public int getTuoi() {
        String[] arr = this.dob.split("/");
        return 2021 - Integer.parseInt(arr[2]);
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.getTuoi() + " " + String.format("%.0f", this.getDiemXepLoai()) + " " + this.getXepLoai();
    } 

    @Override
    public int compareTo(PhuHo o) {
        if (this.getDiemXepLoai() != o.getDiemXepLoai()) {
            if (this.getDiemXepLoai() < o.getDiemXepLoai()) {
                return 1;
            }
            return -1;
        }
        return this.id.compareTo(o.id);
    }
}
