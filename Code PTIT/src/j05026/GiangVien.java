package j05026;

import java.util.*;

public class GiangVien {
    private String id, name, subject;

    public GiangVien(int id, String name, String subject) {
        this.id = "GV" + String.format("%02d", id);
        this.name = name;
        this.subject = subject;
//        this.subject = ChuanHoaSub(subject);
    }
    
    public String ChuanHoaSub(String s) {
        StringTokenizer st = new StringTokenizer(s);
        String res = "";
        while (st.hasMoreTokens()) {
            res += st.nextToken().substring(0, 1).toUpperCase();
        }
        return res;
    }

    public String getLastName() {
        String[] arr = this.name.split("\\s+");
        int n = arr.length;
        return arr[n - 1];
    }
    
    public String getId() {
        return id;
    }

    public void ChuanHoaSub() {
        StringTokenizer st = new StringTokenizer(this.subject);
        String res = "";
        while (st.hasMoreTokens()) {
            res += st.nextToken().substring(0, 1).toUpperCase();
        }
        this.subject = res;
    }  

    public String getSubject() {
        return subject;
    }
        
    public String toString() {
        return this.id + " " + this.name + " " + this.subject;
    }
}
