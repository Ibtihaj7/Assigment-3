package edu.najah.eng.solid.is.assignment.App;

import edu.najah.eng.solid.is.assignment.Bird;
import edu.najah.eng.solid.is.assignment.impl.Eagle;

public class App {
    public static void main(String[] args) {
        Bird bird = new Bird() ;
        bird.setFly(new Eagle(10));

        bird.fly();
        bird.swim();
        bird.molt();

    }

}
