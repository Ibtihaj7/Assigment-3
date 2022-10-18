# Single Responsibility Principle


This principle states that a class should only have one responsibility.
<br />
Invoice class  contains functions that perform different and unrelated functions(add,delete,sendMail), so I decided to separate these functions to interfaces and call them inside the function .and create class to implement these interfaces.

<br />
and MailMessage class alse contain functions doing different thing so i create validateMeesage class and call it inside a functions.
<br/>

**class diagram**


<img width="709" alt="Screen Shot 2022-10-19 at 0 11 34" src="https://user-images.githubusercontent.com/92644947/196545778-1dfc9abf-258d-456c-b856-b3e07e1e1d6a.png">
