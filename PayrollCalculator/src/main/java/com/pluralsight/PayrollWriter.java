package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PayrollWriter {
        public static void writeCsvFile(String filename, List<Employee> employees){
            try{
                BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
                writer.write("id|name|gross pay\n");
                for (Employee employee : employees) {
                    String row = String.format("%d|%s|%.2f\n",
                            employee.getEmployeeId(),
                            employee.getName(),
                            employee.getGrossPay());
                    writer.write(row);
                }
                writer.close();

                System.out.println("CSV payroll file is created");


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
