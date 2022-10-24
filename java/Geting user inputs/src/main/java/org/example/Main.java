package org.example;

import java.util.Scanner;

class Main {
    
    //create a method
    public int addNUmbers(int a ,int b){
        int sum = a*b;
        //return value
        return sum;
    }

    public static void main(String[] args){

        int num1 =25;
        int num2 =15;

        //create an object of main
        Main obj = new Main();
        //calling method
        int result = obj.addNUmbers(num1,num2);
        System.out.println("The sum is: "+result);
    }

}
