package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SearchEngineLogger {

    private static void logAction(String action)  {
        String filePath = "src/main/java/com/pluralsight/logs.txt";
        try (FileWriter writer = new FileWriter(filePath, true)) {
            String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            writer.write(timestamp + " " + action + System.lineSeparator());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


public static void main(String[] args) {
    logAction("launch");

    System.out.println("Application started");
    Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a search term (X to exit):");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("X")){
                logAction("exit");
                break;
            } else {
                logAction("Search : " + input);
                System.out.println("Searching for:" + input);
            }
        }

        scanner.close();
        System.out.println("Application exited");

    }


}
