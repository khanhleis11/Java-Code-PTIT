package j07018;

import java.util.*;

public class SinhVien {
    private String id, name, className, dob;
    private double gpa;

    public SinhVien(int id, String name, String className, String dob, double gpa) {
        this.id = "B20DCCN" + String.format("%03d", id);
        this.name = chuanHoaTen(name);
        this.className = className;
        this.dob = chuanHoaDob(dob);
        this.gpa = gpa;
    }
    
    public String chuanHoaTen(String s) {
        StringTokenizer st = new StringTokenizer(s);
        String ans = "";
        while (st.hasMoreTokens()) {
            String tmp = st.nextToken();
            ans += tmp.substring(0, 1).toUpperCase();
            ans += tmp.substring(1).toLowerCase() + " ";
        }
        ans = ans.trim();
        return ans;
    }
//    12/2/
    public String chuanHoaDob(String s) {
        StringBuilder sb = new StringBuilder(s);
        if (sb.charAt(1) == '/') sb.insert(0, '0');
        if (sb.charAt(4) == '/') sb.insert(3, '0');
        String res = sb.toString();
        return res;
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.className + " " + this.dob + " " + String.format("%.2f", this.gpa);
    }
}
