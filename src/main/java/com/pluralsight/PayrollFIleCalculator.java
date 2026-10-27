package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PayrollFIleCalculator {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String csvLine;
            while ((csvLine = bufferedReader.readLine()) != null) {
                String[] empData = csvLine.split("\\|");
                int employeeID = Integer.parseInt(empData[0]);
                String name = empData[1];
                double hoursWorked = Double.parseDouble(empData[2]);
                double payRate = Double.parseDouble(empData[3]);

                Employee employee = new Employee(employeeID, name, hoursWorked, payRate);
                System.out.printf("%d, %s, %.2f", employee.getEmployeeID(), employee.getName(), employee.getGrossPay());
            }
            bufferedReader.close();
        }
        catch (Exception ex) {
            System.out.println("Employee not found");
        }
    }
}
