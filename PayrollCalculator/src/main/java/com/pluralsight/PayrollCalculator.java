package com.pluralsight;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter the name of file:");
            String inputFile = scanner.nextLine();

            System.out.println("Enter the name of payroll file to create: ");
            String outputFile = scanner.nextLine();

            FileReader fileReader = new FileReader("src/main/resources/DataFiles/employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            List<Employee> employees = new ArrayList<>();

            bufferedReader.readLine();

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split("\\|");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                double hours = Double.parseDouble(data[2]);
                double rate = Double.parseDouble(data[3]);

                Employee employee = new Employee(id, name, hours, rate);
//                System.out.printf("ID: %d | Name: %s | Gross Pay: $%.2f%n",
//                        employee.getEmployeeId(),
//                        employee.getName(),
//                        employee.getGrossPay());
                employees.add(employee);
            }

            bufferedReader.close();

            if (outputFile.endsWith(".csv")) {
                PayrollWriter.writeCsvFile(outputFile, employees);
            }else {
                System.out.println("Invalid file type");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
