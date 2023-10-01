import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class J07035 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());

        ArrayList<SinhVien> arr1 = new ArrayList<>();
        ArrayList<MonHoc> arr2 = new ArrayList<>();
        ArrayList<BangDiem> arr3 = new ArrayList<>();
        HashMap<String, MonHoc> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr1.add(x);
        }

        sc = new Scanner(new File("MONHOC.in"));
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            MonHoc x = new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            arr2.add(x);
            mp.put(x.getIdMH(), x);
        }

        sc = new Scanner(new File("BANGDIEM.in"));
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            String idSV = tmp[0], idMH = tmp[1];
            BangDiem x = new BangDiem(tmp[2]);
            for (SinhVien sv : arr1) {
                if (sv.getIdSV().equals(idSV)) {
                    x.setSv(sv);
                }
            }
            for (MonHoc mh : arr2) {
                if (mh.getIdMH().equals(idMH)) {
                    x.setMh(mh);
                }
            }
            arr3.add(x);
        }
        Collections.sort(arr3);
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String ma = sc.nextLine();
            System.out.println("BANG DIEM MON " + mp.get(ma).getTenMH() + ":");

            for (BangDiem x : arr3) {
                if (x.getMh().getIdMH().equals(ma)) {
                    System.out.println(x);
                }
            }
        }
    }
}

class SinhVien {
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

class BangDiem implements Comparable<BangDiem> {
    private SinhVien sv;
    private MonHoc mh;
    private String diem;

    public BangDiem(String diem) {
        this.diem = diem;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public void setMh(MonHoc mh) {
        this.mh = mh;
    }

    public MonHoc getMh() {
        return mh;
    }

    public String toString() {
        return sv.getIdSV() + " " + sv.getTenSV() + " " + sv.getClassName() + " " + this.diem;
    }

    @Override
    public int compareTo(BangDiem o) {
        if (this.diem.equals(o.diem)) {
            return this.sv.getIdSV().compareTo(o.sv.getIdSV());
        }
        return o.diem.compareTo(this.diem);
    }
}

class MonHoc {
    private String idMH, tenMH;
    private int soTin;

    public MonHoc(String idMH, String tenMH, int soTin) {
        this.idMH = idMH;
        this.tenMH = tenMH;
        this.soTin = soTin;
    }

    public String getIdMH() {
        return idMH;
    }

    public String getTenMH() {
        return tenMH;
    }
}
