package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int size;
        System.out.print("Enter Array Size: ");
        size = input.nextInt();

        MyClass obj = new MyClass();

        int output =obj.Validate(size);

        System.out.println("Array sum is :"+output);



    }
}