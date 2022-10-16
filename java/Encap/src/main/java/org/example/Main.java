package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Radius");
        double Radius = input.nextDouble();
        System.out.println("Enter Pi");
        double Pi = input.nextDouble();

        EncapData getClass = new EncapData();

        getClass.getRadius(Radius);
        getClass.getPi(Pi);

        System.out.println(getClass.Area());
        System.out.println(getClass.Circum());

    }
}