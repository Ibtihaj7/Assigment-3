# Single Responsibility Principle


This principle states that a class should only have one responsibility.
<br />
Invoice class  contains functions that perform different and unrelated functions(add,delete,sendMail), so I decided to separate these functions to interfaces and call them inside the function .and create class to implement these interfaces.

<br />
and MailMessage class alse contain functions doing different thing so i create validateMeesage class and call it inside a functions.
<br/>

**class diagram**

![](../../../../../../../../../../../../var/folders/d4/67_v01g547lcq27l5h8rdxr40000gn/T/TemporaryItems/NSIRD_screencaptureui_WciENP/Screen Shot 2022-10-18 at 22.44.56.png)