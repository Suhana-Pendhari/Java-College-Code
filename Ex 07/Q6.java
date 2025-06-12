// 6.Write a program that writes an array of bytes (e.g., {65, 66, 67}) to a file 
// using FileOutputStream and verifies the content.

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Q6 {
    public static void main(String[] args) {
        String fileName = "bytes.txt";
        byte[] byteArray = {65, 66, 67}; // Corresponds to 'A', 'B', 'C'

        // Write byte array to file
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(byteArray);
            System.out.println("Byte array written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Read and verify content
        System.out.println("Reading file content to verify:");
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data); // Convert byte to character
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
