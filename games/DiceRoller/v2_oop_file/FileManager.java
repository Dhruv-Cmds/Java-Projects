package DiceRoller.v2_oop_file;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileManager {

    private static final String FILE_NAME = "dice_history.txt";

    public static void saveRoll(int rollNumber, int rollValue) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write("Roll " + rollNumber + ": " + rollValue + "\n");
        } catch (IOException e) {
            System.out.println("Error writing roll to file.");
        }
    }

    public static void saveTotal(int total) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write("Total: " + total + "\n");
            writer.write("Time: " + LocalDateTime.now() + "\n");
            writer.write("-------------------------\n");
        } catch (IOException e) {
            System.out.println("Error writing total to file.");
        }
    }
}