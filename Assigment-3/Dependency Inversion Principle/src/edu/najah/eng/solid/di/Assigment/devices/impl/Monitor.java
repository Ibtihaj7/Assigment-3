package edu.najah.eng.solid.di.Assigment.devices.impl;

import edu.najah.eng.solid.di.Assigment.devices.interf.IMonitor;

public class Monitor implements IMonitor {
    @Override
    public void turnOn(){
        System.out.println("Turn on " + this.getClass().getName());
    }
    @Override
    public void turnOff(){
        System.out.println("Turn off " + this.getClass().getName());
    }

}
