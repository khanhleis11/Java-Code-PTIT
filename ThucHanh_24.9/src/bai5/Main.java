package bai5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Team> arr1 = new ArrayList<>();
        ArrayList<ThiSinh> arr2 = new ArrayList<>();
        
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            Team x = new Team(sc.nextLine(), sc.nextLine());
            arr1.add(x);
        }
        
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < m; i++) {
            String name = sc.nextLine();
            String teamID = sc.nextLine();
            ThiSinh x = new ThiSinh(name, teamID);
            for (Team y : arr1) {
                if (y.teamID.equals(teamID)) {
                    x.doi = y;
                }
            }
            arr2.add(x);
        }
        Collections.sort(arr2, new Comparator<ThiSinh>() {
            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
                return o1.name.compareTo(o2.name);
            }
            
        });
        for (ThiSinh x : arr2) {
            System.out.println(x);
        }
    }
}
