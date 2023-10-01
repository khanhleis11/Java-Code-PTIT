package j04006;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien x = new SinhVien("B20DCCN001",sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
        x.ChuanHoa();
        x.display();
    }
}
