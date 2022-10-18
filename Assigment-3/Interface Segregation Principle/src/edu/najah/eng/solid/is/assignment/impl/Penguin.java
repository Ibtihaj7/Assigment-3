package edu.najah.eng.solid.is.assignment.impl;
import edu.najah.eng.solid.is.assignment.birdTypes.Swim;

public class Penguin implements Swim {
    String currentLocation;
    int numberOfFeathers;
    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    @Override
    public void swim() {
        this.currentLocation = "in the water";
        System.out.println("i'm swimming");
    }
}
