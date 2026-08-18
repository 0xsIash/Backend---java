import java.io.FileReader;
import java.io.IOException;

public class Task10_ThrowsKeyword {

    public static void readFile() throws IOException {

        FileReader file = new FileReader("test.txt");

        System.out.println("File opened successfully!");

        file.close();
    }

    public static void main(String[] args) {

        try {

            readFile();

        } catch (IOException e) {

            System.out.println("Could not read the file!");
        }
    }
}