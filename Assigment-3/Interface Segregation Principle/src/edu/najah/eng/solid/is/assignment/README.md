# Interface Segregation Principle

in this principle, every class should not be forced to depend upon interfaces that you don't use. and in "Eagle.java" Eagle class override swim function ,but the eagle does not support swim, and the same thing in Penguin class it override fly function, but Penguin not support fly,then the classes override function that don't need
<br/>
<br/>
The solution is to create interfaces for each function, and then the class implement only the interfaces that needs.But molt function common to all bird type, so not need to create interface to it.
<br/>
<br/>
so i create Fly,Swim interfaces ,and implement interfaces that class need ,then Eagle implement  Fly just,cause Eagle not suport swim then not need to implement swim.
<br/>
in the bird class contain all common function(molt) and include object of interface, and functions to call each type of bird
<br/>

**class diagram**


![Uploading Screen Shot 2022-10-19 at 0.07.18.png…]()

