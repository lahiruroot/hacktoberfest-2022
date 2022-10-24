package org.example;

public class EncapData {

    private double radius;
    private double pi;

    public void getRadius(Double userRadus)
    {
        radius = userRadus;
    }

    public  void getPi(Double userPi)
    {
        pi = userPi;
    }

    public double Area()
    {
        return pi*radius*radius;
    }

    public int Circum()
    {
        return 2*pi*radius;
    }

}
