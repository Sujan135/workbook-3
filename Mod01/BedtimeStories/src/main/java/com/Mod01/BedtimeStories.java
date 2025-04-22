package com.Mod01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the name of a Story: ");
            String fileName = scanner.nextLine();

            FileInputStream fis = new FileInputStream("src/main/resources/DataFiles/" + fileName);

            Scanner fileScanner = new Scanner(fis);

            while (fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                System.out.println(line);
            }

            fileScanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        scanner.close();

    }
}
