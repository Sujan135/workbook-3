package com.Mod01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = false;

        while (!running) {
            System.out.println("Enter the name of a Story: ");
            String fileName = scanner.nextLine();

            try {
                FileInputStream fis = new FileInputStream("src/main/resources/DataFiles/" + fileName);
                Scanner fileScanner = new Scanner(fis);

                int lineNumber = 1;
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    System.out.println(lineNumber + ". " + line);
                    lineNumber++;
                }

                fileScanner.close();
                running = true;

            } catch (IOException e) {
                System.out.println("Error: File not found! Please try again.\n");
            }
        }

        scanner.close();
    }
}
