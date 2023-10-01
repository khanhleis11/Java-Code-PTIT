import java.io.*;
import java.util.ArrayList;

public class TestCase {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Jhsf00dklT12uhf780LPPZH");
        strings.add("AAAAddd0000000000000000001T");

        try {
            // Serialize the ArrayList to a binary file
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("DATA.in"));
            objectOutputStream.writeObject(strings);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
