package edu.najah.eng.solid.di.Assigment.devices.impl;

import edu.najah.eng.solid.di.Assigment.devices.interf.IKeybord;

public class Keyboard implements IKeybord {
    @Override
    public void powerOn(){ System.out.println("Power on " + this.getClass().getName()); }
    @Override
    public void powerOff(){
        System.out.println("Power off " + this.getClass().getName());
    }
}
