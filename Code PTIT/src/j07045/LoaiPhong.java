package j07045;

public class LoaiPhong implements Comparable<LoaiPhong> {
    private String line, name;
    
    public LoaiPhong(String line) {
        this.line = line;
        String[] arr = line.split("\\s+");
        this.name = arr[1];
    }
    
    public String toString() {
        return this.line;
    }
    
    public int compareTo(LoaiPhong o) {
        return this.name.compareTo(o.name);
    }
}
