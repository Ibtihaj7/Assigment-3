# Liskov Substitution Principle (LSP)

the problem here in the main when declare a object of type Customer and call addOffer function then it will call it,
but when we change the type of object to LimitedCustomer and call the same function then the result is different because the function's behavior is different.
<br/>
but this principle states that objects of a superclass should be replaceable with objects of its subclasses without breaking the application.
<br/> 
so i create a general class to extend it from Customer and LimitedCustomer ,This way, the LSP rule will not be broken.and when we call the same function for super or subclass the result is same.


**class diagram**

![](../../../../../../../../../../../../var/folders/d4/67_v01g547lcq27l5h8rdxr40000gn/T/TemporaryItems/NSIRD_screencaptureui_k3vriD/Screen Shot 2022-10-18 at 22.08.40.png)