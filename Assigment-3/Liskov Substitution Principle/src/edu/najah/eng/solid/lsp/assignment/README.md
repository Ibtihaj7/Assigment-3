# Liskov Substitution Principle (LSP)

the problem here in the main when declare a object of type Customer and call addOffer function then it will call it,
but when we change the type of object to LimitedCustomer and call the same function then the result is different because the function's behavior is different.
<br/>
but this principle states that objects of a superclass should be replaceable with objects of its subclasses without breaking the application.
<br/> 
so i create a general class to extend it from Customer and LimitedCustomer ,This way, the LSP rule will not be broken.and when we call the same function for super or subclass the result is same.


**class diagram**



<img width="665" alt="Screen Shot 2022-10-19 at 0 16 02" src="https://user-images.githubusercontent.com/92644947/196546442-b7d84bd9-1826-4f32-bec3-c6cf3ea86a10.png">
