package com.pluralsight;

public class Employee {
    //employeeid, name, hoursworked, payrate
    private int employeeID;
    private String name;
    private double hoursWorked;
    private double payRate;

    public Employee(int employeeID, String name, double hoursWorked, double payRate){
        this.employeeID = employeeID;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

     public int getEmployeeID(){
        return employeeID;
     }
    public String getName() {
        return name;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    public double getPayRate() {
        return payRate;
    }
    public double getGrossPay() {
        double grossPay = hoursWorked * payRate;
        return grossPay;
    }

}
