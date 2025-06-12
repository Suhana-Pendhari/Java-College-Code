// 3.Create a program that opens a text file using FileReader and reads only the 
// first 100 characters before displaying them.

import java.io.FileReader;
import java.io.IOException;

public class Q3 {
    public static void main(String[] args) {
        String fileName = "Reading.txt";

        try (FileReader reader = new FileReader(fileName)) {
            char[] buffer = new char[100];
            int charsRead = reader.read(buffer, 0, 100);

            if (charsRead == -1) {
                System.out.println("The file is empty.");
            } else {
                System.out.println("First 100 characters (or less) from the file:");
                System.out.println(new String(buffer, 0, charsRead));
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
