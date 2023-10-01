package j07035;

import java.util.StringTokenizer;

public class SinhVien {
    private String idSV, tenSV, className, email;

    public SinhVien(String idSV, String tenSV, String className, String email) {
        this.idSV = idSV;
        this.tenSV = chuanHoaTen(tenSV);
        this.className = className;
        this.email = email;
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
}
