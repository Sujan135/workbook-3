package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayrollCalculator {
    public static void main(String[] args) {
        try{

            FileReader fileReader = new FileReader("src/main/resources/DataFiles/employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            bufferedReader.readLine();

            String line;
            while((line = bufferedReader.readLine()) != null) {
                String[] data = line.split("\\|");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                double hours = Double.parseDouble(data[2]);
                double rate = Double.parseDouble(data[3]);

                Employee employee = new Employee(id, name,hours,rate);
                System.out.printf("ID: %d | Name: %s | Gross Pay: $%.2f%n",
                        employee.getEmployeeId(),
                        employee.getName(),
                        employee.getGrossPay());
            }

            bufferedReader.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
