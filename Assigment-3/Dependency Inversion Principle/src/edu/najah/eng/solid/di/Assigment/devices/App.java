package edu.najah.eng.solid.di.Assigment.devices;

import edu.najah.eng.solid.di.Assigment.devices.impl.Keyboard;
import edu.najah.eng.solid.di.Assigment.devices.impl.Monitor;

public class App {
    public static void main(String[] args) {
        WindowsMachine windowsMachine = new WindowsMachine(new Keyboard(),new Monitor());

        windowsMachine.changeKeyboardStatus(true);
        windowsMachine.changeMonitorStatus(false);

        System.out.println("-------------------------");

        windowsMachine.changeKeyboardStatus(false);
        windowsMachine.changeMonitorStatus(true);

    }
}