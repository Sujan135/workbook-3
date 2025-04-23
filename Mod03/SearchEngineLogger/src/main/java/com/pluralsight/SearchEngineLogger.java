package com.pluralsight;

import java.util.Scanner;

public class SearchEngineLogger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Application started");

        while(true) {
            System.out.println("Enter a search term (X to exit):");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("X")){
                break;
            } else {
                System.out.println("Searching for:" + input);
            }
        }

        scanner.close();
        System.out.println("Application exited");

    }
}
