package j04002;

import java.util.*;

public class Main {
    public static boolean check(String s) {
        double tmp = Double.parseDouble(s);
        if (tmp == (int)tmp){
            return true;
        }
        return false;
    }   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<String> arr = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            String tmp = st.nextToken();
            arr.add(tmp);
        }
        int flag = 1;
        if (Double.parseDouble(arr.get(0)) <= 0 || Double.parseDouble(arr.get(1)) <= 0 || !check(arr.get(0)) || !check(arr.get(1))) {
            System.out.println("INVALID");
            flag = 0;
        }
        if (flag == 1) {
            Rectange x = new Rectange(Double.parseDouble(arr.get(0)), Double.parseDouble(arr.get(1)), arr.get(2));
            System.out.println(x);
        }
        
    }
}
