package com.tripillar.filehandling.text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteTextFile {
    public static void main(String[] args) {
        String filePath = "File1.txt";
        // String content = "This is an example text."; Static example
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the content to write to the file: ");
        String content = scanner.nextLine();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
        }
    }
}