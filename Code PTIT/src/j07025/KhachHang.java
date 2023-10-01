package j07025;

import java.util.*;

public class KhachHang {
    private String id, name, gender, dob, add;

    public KhachHang(int id, String name, String gender, String dob, String add) {
        this.id = "KH" + String.format("%03d", id);
        this.name = chuanHoaTen(name);
        this.gender = gender;
        this.dob = chuanHoaDob(dob);
        this.add = add;
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

    public String chuanHoaDob(String s) {
        StringBuilder sb = new StringBuilder(s);
        if (sb.charAt(1) == '/') sb.insert(0, '0');
        if (sb.charAt(4) == '/') sb.insert(3, '0');
        String res = sb.toString();
        return res;
    }
    
    public int getDay() {
        String[] arr = this.dob.split("/");
        return Integer.valueOf(arr[0]);
    }
    
    public int getMonth() {
        String[] arr = this.dob.split("/");
        return Integer.valueOf(arr[1]);
    }
    
    public int getYear() {
        String[] arr = this.dob.split("/");
        return Integer.valueOf(arr[2]);
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.gender + " " + this.add + " " + this.dob;
    }
}
