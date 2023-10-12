
package monHoc;

public class MonHoc {
    private String id, name, hinhThuc;

    public MonHoc(String id, String name, String hinhThuc) {
        this.id = id;
        this.name = name;
        this.hinhThuc = hinhThuc;
    }

    public String getId() {
        return id;
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.hinhThuc;
    }
}
