 package edu.najah.eng.solid.di.Assigment.devices;

 import edu.najah.eng.solid.di.Assigment.devices.interf.IKeybord;
 import edu.najah.eng.solid.di.Assigment.devices.interf.IMonitor;

 public class WindowsMachine {
    public final IKeybord keybord;
    public final IMonitor monitor;
    public WindowsMachine(IKeybord keybord,IMonitor monitor){
        this.keybord = keybord;
        this.monitor = monitor;
    }

    public void changeKeyboardStatus(boolean status){
        if (status) keybord.powerOn();
         else keybord.powerOff();
    }

    public void changeMonitorStatus(boolean status){
        if (status) monitor.turnOff();
         else monitor.turnOn();
    }
}