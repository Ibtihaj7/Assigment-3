# Dependency Inversion Principle

In this principle the high-level module:"WindowsMachine.java", depend on low-level modules:("Keybord.java","Monitor.java").
but this is incorrect, both(WindowsMachine,Keybord,Monitor) should depend on abstractions.
<br/>
so i create an interfaces(IKeybord & IMonitor) and make class(Keybord implement from IKetbord & Monitor implement from IMonitor) , then the class"WindowsMachine" depend on interfaces instead of low-level modules.
<br/>
now high-level module & low-level modules depend on abstractions as they should. 

**class diagram :**

![](../../../../../../../../../../../../var/folders/d4/67_v01g547lcq27l5h8rdxr40000gn/T/TemporaryItems/NSIRD_screencaptureui_5jjvUW/Screen Shot 2022-10-18 at 13.46.35.png)



