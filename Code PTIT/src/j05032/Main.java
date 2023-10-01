package j05032;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> arr = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            Person x = new Person(tmp[0], tmp[1]);
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (!o1.getYear().equals(o2.getYear())) {
                    return o1.getYear().compareTo(o2.getYear());
                } else {
                    if (!o1.getMonth().equals(o2.getMonth())) {
                        return o1.getMonth().compareTo(o2.getMonth());
                    }
                    return o1.getDay().compareTo(o2.getDay());
                }
            }
            
        });
        System.out.println(arr.get(arr.size() - 1).getName() + "\n" + arr.get(0).getName());
    }
}
