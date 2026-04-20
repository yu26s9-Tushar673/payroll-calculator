package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

public class PayrollCalculator
{
    static void main() throws IOException {

        String input;
        BufferedReader bufReader = new BufferedReader(new FileReader("employees.csv"));
        int count = 0;

        bufReader.readLine();
        while((input = bufReader.readLine()) != null)
        {
            String[] data = input.split("\\|");
            Employee employee = new Employee(Integer.parseInt(data[0]), data[1], Double.parseDouble(data[2]), Double.parseDouble(data[3]));
            System.out.println(employee.getEmployeeID() + " " +  employee.getName() + " " + employee.getGrossPay());
        }

    }
}
