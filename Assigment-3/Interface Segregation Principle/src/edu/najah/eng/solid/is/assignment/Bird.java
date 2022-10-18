package edu.najah.eng.solid.is.assignment;
import edu.najah.eng.solid.is.assignment.birdTypes.Swim;
import edu.najah.eng.solid.is.assignment.birdTypes.Fly;

public class Bird {
    private Fly fly;
    private Swim swim;

    public Fly getFly() { return fly; }

    public void setFly(Fly fly) { this.fly = fly; }

    public Swim getSwim() { return swim; }

    public void setSwim(Swim swim) { this.swim = swim; }

    public void molt(){ System.out.println("molt molt molt"); }

    public void fly(){
        if(this.fly != null)  fly.fly();
    }
    public void swim(){
        if(this.swim!=null) swim.swim();
    }
}
