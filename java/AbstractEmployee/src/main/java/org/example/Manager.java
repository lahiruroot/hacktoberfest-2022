package org.example;
import java.util.Scanner;
public class Manager extends Employee {
Scanner input = new Scanner(System.in);
    @Override
    public void EmployeeInfo() {
        System.out.print("Enter Manager Name: ");
        String Name = input.next();
        System.out.println(Name);
    }
}
