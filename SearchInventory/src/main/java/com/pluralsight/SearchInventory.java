package com.pluralsight;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class SearchInventory {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();

        inventory.sort(Comparator.comparing(Product::getName));

//        Scanner scanner = new Scanner(System.in);

        System.out.println("We carry the following inventory: ");

        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f\n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();

        try {
            String filePath = "src/main/resources/DataFiles/inventory.csv";
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] parts = line.split("\\|");

                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                float price = Float.parseFloat(parts[2]);

                Product product = new Product(id, name, price);
                inventory.add(product);
            }

            bufferedReader.close();

        }catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }
//        inventory.add(new Product(1, "iphone", 999.99f));
//        inventory.add(new Product(1, "Shoes", 99.99f));
//        inventory.add(new Product(1, "Book", 9.99f));
//        inventory.add(new Product(1, "Food", 69.99f));
//        inventory.add(new Product(2, "Macbook", 1999.99f));

        return inventory;
    }
}
