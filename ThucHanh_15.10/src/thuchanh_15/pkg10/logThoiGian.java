package thuchanh_15.pkg10;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class logThoiGian {
    public static boolean isValidTime(String time) {
        String[] tmp = time.split(":");
        if (tmp.length != 3) {
            return false;
        }
        
        int h = Integer.parseInt(tmp[0]);
        int m = Integer.parseInt(tmp[1]);
        int s = Integer.parseInt(tmp[2]);
        
        return h >= 0 && h <= 23 && m >= 0 && m <= 59 && s >= 0 && s <= 59; 
    }
    
    public static ArrayList<String> solve(ArrayList<String> arr) {
        ArrayList<String> validTimes = new ArrayList<>();
        Pattern timePattern = Pattern.compile("\\d{2}:\\d{2}:\\d{2}");
        for (String line : arr) {
            Matcher matcher = timePattern.matcher(line);
            while (matcher.find()) {
                String time = matcher.group();
                if (isValidTime(time)) {
                    validTimes.add(time);
                }
            }
        }
        return validTimes;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.isEmpty()) {
                break;
            }
            arr.add(s);
        }
        
        ArrayList<String> res = solve(arr);
        Collections.sort(res);
        LinkedHashSet<String> se = new LinkedHashSet<>();
        for (String x : res) {
            se.add(x);
        }
        for (String x : se) {
            System.out.println(x);
        }
    }
}
