// 4.Create a program that reads a text file using FileInputStream and displays its 
// content on the console.

import java.io.FileInputStream;
import java.io.IOException;

public class Q4 {
    public static void main(String[] args) {
        String fileName = "message.txt";

        try (FileInputStream inputStream = new FileInputStream(fileName)) {
            int byteData;
            System.out.println("File content:");
            while ((byteData = inputStream.read()) != -1) {
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
