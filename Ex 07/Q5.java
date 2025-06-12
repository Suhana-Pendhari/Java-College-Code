// 5.Write a program that writes a short message ("Hello, World!") to a 
// file using FileOutputStream.

import java.io.FileOutputStream;
import java.io.IOException;

public class Q5 {
    public static void main(String[] args) {
        String fileName = "output.txt";
        String message = "Hello, World!";

        try (FileOutputStream outputStream = new FileOutputStream(fileName)) {
            byte[] data = message.getBytes(); // Convert string to byte array
            outputStream.write(data);
            System.out.println("Message written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
