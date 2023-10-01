package j07081;

public class SinhVien {
    private String id, name, sdt, email;

    public SinhVien(String id, String name, String sdt, String email) {
        this.id = id;
        this.name = name;
        this.sdt = sdt;
        this.email = email;
    }
    
    public String getHo() {
        String[] arr = this.name.split("\\s+");
        return arr[0];
    }
    
    public String getTen() {
        String[] arr = this.name.split("\\s+");
        return arr[arr.length - 1];
    }
    
    public String getDem() {
        String[] arr = this.name.split("\\s+");
        String res = "";
        for (int i = 1; i < arr.length - 1; i++) {
            res += arr[i];
        }
        return res;
    }

    public String getId() {
        return id;
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.sdt + " " + this.email;
    }
}
