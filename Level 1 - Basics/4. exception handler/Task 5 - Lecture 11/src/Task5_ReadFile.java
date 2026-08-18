import java.io.FileReader;
import java.io.FileNotFoundException;

public class Task5_ReadFile {

    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("test.txt");

            System.out.println("File opened successfully!");

            file.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");

        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
    }
}