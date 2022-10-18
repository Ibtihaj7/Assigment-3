# Dependency Inversion Principle

In this principle the high-level module:"WindowsMachine.java", depend on low-level modules:("Keybord.java","Monitor.java").
but this is incorrect, both(WindowsMachine,Keybord,Monitor) should depend on abstractions.
<br/>
so i create an interfaces(IKeybord & IMonitor) and make class(Keybord implement from IKetbord & Monitor implement from IMonitor) , then the class"WindowsMachine" depend on interfaces instead of low-level modules.
<br/>
now high-level module & low-level modules depend on abstractions as they should. 

**class diagram :**



<img width="653" alt="Screen Shot 2022-10-19 at 0 05 46" src="https://user-images.githubusercontent.com/92644947/196544765-6552a91e-d4f2-490e-bd07-2b561a232f63.png">
