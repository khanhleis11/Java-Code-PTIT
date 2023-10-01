package j07036;

import java.util.*;

public class SinhVien {
    private String idSV, tenSV, className, email;

    public SinhVien(String idSV, String tenSV, String className, String email) {
        this.idSV = idSV;
        this.tenSV = chuanHoaTen(tenSV);
        this.className = className;
        this.email = email;
    }
    
    public String chuanHoaTen(String s) {
        String ans = "";
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            String tmp = st.nextToken();
            ans += tmp.substring(0, 1).toUpperCase();
            ans += tmp.substring(1).toLowerCase() + " ";
        }
        ans = ans.trim();
        return ans;
    }

    public String getIdSV() {
        return idSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public String getClassName() {
        return className;
    }
    
}
