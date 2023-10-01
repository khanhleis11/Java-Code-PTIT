package j07072;

import java.util.StringTokenizer;

public class FullName implements Comparable<FullName>{
    private String hoTen, ho, dem, ten;
    
    public FullName(String s) {
        s = ChuanHoaTen(s);
        this.hoTen = s;
        String[] arr = s.split("\\s+");
        this.ho = arr[0];
        String tmp = "";
        for (int i = 1; i < arr.length - 1; i++) {
            tmp += arr[i];
        }
        this.dem = tmp;
        this.ten = arr[arr.length - 1];
    }
    
    public String ChuanHoaTen(String s) {
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
    
    public int compareTo(FullName o) {
        if (this.ten.equals(o.ten)) {
            if (this.ho.equals(o.ho)) {
                return this.dem.compareTo(o.dem);
            }
            return this.ho.compareTo(o.ho);
        }
        return this.ten.compareTo(o.ten);
    }
    
    public String toString() {
        return this.hoTen;
    }
}
