package org.example;
//SubClass (inherit from Animal)
public class Pig extends Animal{
    public void animalSound(){
        //The Body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }

    @Override
    public void animalWeight() {
        System.out.println("Animal Weight is: 50KG");
    }
}
