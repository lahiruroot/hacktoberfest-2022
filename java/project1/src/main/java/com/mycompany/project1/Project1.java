/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.project1;

/**
 *
 * @author Leo Gavin
 */

import java.util.Scanner;
public class Project1 {

    Scanner input = new Scanner(System.in);

        // Getting input
        System.out.println("Enter Your Number: ");
        Double num1 = input.nextDouble();

        if (num1 % 2 == 0) {

            System.out.println("Your Number is an Even");
        } else {
            System.out.println("Your Number is an Odd");
        }

    }
    }
}
