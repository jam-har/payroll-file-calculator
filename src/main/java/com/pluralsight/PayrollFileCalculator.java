package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class PayrollFileCalculator {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.readLine();
            String csvLine;
            while ((csvLine = bufferedReader.readLine()) != null) {
                String[] empData = csvLine.split("\\|");
                int employeeID = Integer.parseInt(empData[0]);
                String name = empData[1];
                double hoursWorked = Double.parseDouble(empData[2]);
                double payRate = Double.parseDouble(empData[3]);

                Employee employee = new Employee(employeeID, name, hoursWorked, payRate);
                System.out.printf("%d, %s, %.2f%n", employee.getEmployeeID(), employee.getName(), employee.getGrossPay());
            }
            bufferedReader.close();
        }
        catch (Exception ex) {
            System.out.println("Employee not found");
        }
    }
}
