package com.pluralsight;

import java.security.PrivateKey;

public class Employee {
    private  int employedId;
    private  String name;
    private double hoursWorked;
    private double payRate;

    public Employee(int employedId, String name, double hoursWorked, double payRate) {
        this.employedId = employedId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public int getEmployedId() {
        return employedId;
    }

    public String getName(){
        return name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked (double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public  void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getGrossPay() {
        return hoursWorked * payRate;
    }


}
