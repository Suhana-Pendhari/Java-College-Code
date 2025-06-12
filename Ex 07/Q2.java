// 2.Create a program that writes a short message to a text file using FileWriter 
// and then reads it back using FileReader.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q2 {
    public static void main(String[] args) {
        String fileName = "message.txt";
        String message = "Hello! This message is written to a file using FileWriter.";

        // Write message to file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(message);
            System.out.println("Message written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Read message from file
        try (FileReader reader = new FileReader(fileName)) {
            System.out.println("\nReading message from file:");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
