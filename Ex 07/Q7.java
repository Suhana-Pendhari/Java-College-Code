// 7.Develop a program that reads a text file using BufferedInputStream and 
// prints its content character by character.

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Q7 {
    public static void main(String[] args) {
        String fileName = "sample.txt";

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName))) {
            int data;
            System.out.println("File content:");
            while ((data = bis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
