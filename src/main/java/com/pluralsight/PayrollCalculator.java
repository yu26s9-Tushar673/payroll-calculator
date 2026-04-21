package com.pluralsight;

import java.io.*;
import java.text.ParseException;
import java.util.Scanner;

public class PayrollCalculator
{
    static void main() throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the file employee file to process: ");
        BufferedReader bufReader = new BufferedReader(new FileReader(scanner.nextLine()));
        System.out.print("Enter the name of the payroll file to create: ");
        BufferedWriter bufWriter = new BufferedWriter(new FileWriter(scanner.nextLine()));

        String text;
        String input;

        int count = 0;

        bufReader.readLine();
        while((input = bufReader.readLine()) != null)
        {
            String[] data = input.split("\\|");
            Employee employee = new Employee(Integer.parseInt(data[0]), data[1], Double.parseDouble(data[2]), Double.parseDouble(data[3]));
            System.out.println(employee.getEmployeeID() + " " +  employee.getName() + " " + employee.getGrossPay());
            bufWriter.write(employee.getEmployeeID() + " | " +  employee.getName() + " | " + employee.getGrossPay() + "\n");
        }
        bufWriter.close();

    }
}
