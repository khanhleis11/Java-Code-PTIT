package j07071;

import java.util.*;

public class Name implements Comparable<Name>{
    private String fullName, ho, ten, vietTat;
    
    public Name(String s) {
        this.fullName = s;
        String[] arr = s.split("\\s+");
        this.ho = arr[0];
        this.ten = arr[arr.length - 1];
        String tmp = "";
        for (String x : arr) {
            tmp += x.substring(0, 1);
        }
        this.vietTat = tmp;
    }
    
    public boolean compare(String s)
    {
        if (s.length() != vietTat.length())
            return false;
        for (int i = 0; i < s.length(); ++i)
        {
            if (s.charAt(i) == '*')
                continue;
            if (s.charAt(i) != vietTat.charAt(i))
                return false;
        }
        return true;
    }
    
    public int compareTo(Name o) {
        if (this.ten.equals(o.ten)) {
            return this.ho.compareTo(o.ho);
        }
        return this.ten.compareTo(o.ten);
    }
    
    public String toString() {
//        return this.fullName + "\n" + this.ho + " " + this.ten + "\n" + this.vietTat;
        return this.fullName;
    }
}
