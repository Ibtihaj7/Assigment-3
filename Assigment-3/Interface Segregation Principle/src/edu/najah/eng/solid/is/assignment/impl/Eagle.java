package edu.najah.eng.solid.is.assignment.impl;
import edu.najah.eng.solid.is.assignment.birdTypes.Fly;

public class Eagle implements  Fly {
    String currentLocation;
    int numberOfFeathers;
    public Eagle(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }
    @Override
    public void fly() {
        this.currentLocation = "in the air";
        System.out.println("i'm flying");
    }
}