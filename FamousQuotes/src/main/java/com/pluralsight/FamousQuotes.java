package com.pluralsight;

import java.util.Random;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] quotes = {
                "Be yourself; everyone else is already taken. - Oscar Wilde",
                "Two things are infinite: the universe and human stupidity. - Albert Einstein",
                "So many books, so little time. - Frank Zappa",
                "A room without books is like a body without a soul. - Marcus Tullius Cicero",
                "You only live once, but if you do it right, once is enough. - Mae West",
                "Be the change that you wish to see in the world. - Mahatma Gandhi",
                "If you tell the truth, you don't have to remember anything. - Mark Twain",
                "Always forgive your enemies; nothing annoys them so much. - Oscar Wilde",
                "To live is the rarest thing in the world. Most people exist, that is all. - Oscar Wilde",
                "Without music, life would be a mistake. - Friedrich Nietzsche"
        };

        boolean running = true;

        while (running) {
            System.out.println("\nMenu: ");
            System.out.println("1. Select a quote by number");
            System.out.println("2. Display a random quote");
            System.out.println("3. Exit");
            System.out.println("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Enter a number between 1 and 10: ");
                    try {
                        int number = Integer.parseInt(scanner.nextLine());
                        if (number >= 1 && number <= 10) {
                            System.out.println("Quote: " + quotes[number - 1]);
                        } else {
                            System.out.println("Number is out of range: ");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a number");
                    }
                    break;
                case "2":
                    int randomNumber = random.nextInt(quotes.length);
                    System.out.println("Random Quote: " + quotes[randomNumber]);
                    break;
                case "3":
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option: Try again.");
            }
        }

        scanner.close();

    }
}
