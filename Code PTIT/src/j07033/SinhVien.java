package j07033;

import java.util.StringTokenizer;

public class SinhVien {
    private String id, name, className, email;

    public SinhVien(String id, String name, String className, String email) {
        this.id = id;
        this.name = chuanHoaTen(name);
        this.className = className;
        this.email = email;
    }
    
    public String chuanHoaTen(String s) {
        String res = "";
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            String tmp = st.nextToken();
            res += tmp.substring(0, 1).toUpperCase();
            res += tmp.substring(1).toLowerCase() + " ";
        }
        return res;
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.className + " " + this.email;
    }
}
