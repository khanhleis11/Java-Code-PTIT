package j05007;

import java.util.*;

public class NhanVien {
    private String id, name, gender, dob, add, mst, date;

    public NhanVien(int id, String name, String gender, String dob, String add, String mst, String date) {
        this.id = String.format("%05d", id);
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.add = add;
        this.mst = mst;
        this.date = date;
    }
    
    public int getYear() {
        String[] s = this.dob.split("/");
        ArrayList<String> arr = new ArrayList<>();
        for (String x : s) {
            arr.add(x);
        }
        return Integer.parseInt(arr.get(2));
    }
    
    public int getMonth() {
        String[] s = this.dob.split("/");
        ArrayList<String> arr = new ArrayList<>();
        for (String x : s) {
            arr.add(x);
        }
        return Integer.parseInt(arr.get(1));
    }
    
    public int getDay() {
        String[] s = this.dob.split("/");
        ArrayList<String> arr = new ArrayList<>();
        for (String x : s) {
            arr.add(x);
        }
        return Integer.parseInt(arr.get(0));
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + this.gender + " " + this.dob + " " + this.add + " " + this.mst + " " + this.date;
    }
}
