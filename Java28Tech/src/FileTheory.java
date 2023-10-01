import java.util.*;
import java.io.*;

public class FileTheory {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        FileWriter out = new FileWriter("DATA.out");
        while (sc.hasNext()) {
            String s = sc.next();
            out.write(s + "\n");
        }
        out.close();
//        out.write(str);
    }
}
