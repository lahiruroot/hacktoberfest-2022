package org.example;

public class Cat extends Animal{

    public void catmethod(){
        parentMethod();
        System.out.print("I have " + legs + " legs");
    }
}
