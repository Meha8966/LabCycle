import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {

        try {
            // Write into file
            FileWriter writer = new FileWriter("data.txt");
            writer.write("Hello Java\n");
            writer.write("This is File Handling");
            writer.close();

            // Read from file
            File file = new File("data.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}