package org.example;

import java.util.Scanner;

public class Studnet {

Scanner input = new Scanner(System.in);
    public Studnet() {

        System.out.print("Enter Name: ");
        String Name = input.next();
        System.out.println(Name);
    }

    public Studnet(int i) {
        System.out.println(i);
    }


}
