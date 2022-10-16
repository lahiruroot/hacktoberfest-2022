package org.example;

import java.util.Scanner;
public class MyClass {

    public int Validate(int size)
    {
        Scanner input = new Scanner(System.in);
        int i,sum;
        int y=1;
        int [] newArray  = new int[size];

        for(i=0;i<size;i++)
        {
            System.out.print("Enter Number "+y+" :");
            y++;
            newArray[i] = input.nextInt();

        }


        return sum = newArray[0]+newArray[sie];

    }
}
