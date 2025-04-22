package com.Mod01;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the name of a Story: ");
            String fileName = scanner.nextLine();

            // just to make sure your file exist in fileName //
            File file = new File(fileName);
            if (!file.exists()){
                System.out.println("Error: File not found!");
                return;
            }

            FileInputStream fis = new FileInputStream(fileName);
            Scanner fileScanner = new Scanner(fis);
            String line;
            int lineNumber = 1;

            while (fileScanner.hasNextLine()){
                line = fileScanner.nextLine();
                System.out.println(lineNumber + " . " + line);
                lineNumber++;
            }

            fileScanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();

    }
}
