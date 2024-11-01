#### objects

to solve real world problems via programming/coding
any real world entity is object

### classes

the blueprints of the object is present in class i.e. the objects behavior, look and its properties are present inside a class. By looking the class we can know how the object will look like

- every object has its properties and methods which is defined in its class
- class is a user-defined data types which defines its variables and functions
- class is a logical representation of data meaning it has no physical apperance in real life or programming
- Human being is a class. The body parts are its properties and the actions performed are its functions.
- physical entity of human i.e you and me are objects which has the human class properties and funtions

### Encapsulation

binding data and methods of an object which operates as a single unit(class)

### this

- this refers to the object variable. we use 'this.class_variable' to store the value of the object variables
- this refers to the object you are using right now
- the most common use of this keyword is to eliminate the confusion between class variables or attributes and method parameters
- simply current class object

### \*static int money=0 vs int money=0

1. Scope and Access:

   - static int money = 0;
     Static Variable: This is a class variable, meaning it belongs to the class itself rather than any specific object of the class. There is only one copy of this variable shared among all instances of the class.
     Access: It can be accessed using the class name, e.g., ClassName.money, and also through an instance of the class, e.g., instance.money.

   int money = 0;:
   Instance Variable: This variable belongs to the every instance of the class. Each object of the class has its own copy of this variable, so changes to money in one instance will not affect the money variable in other instances.
   Access: It can only be accessed through an instance of the class, e.g., instance.money.

2. Memory Allocation:

   Static Variable:
   Allocated memory once when the class is loaded into memory.
   All instances share the same memory location for this variable.

   Instance Variable:
   Allocated memory for each instance of the class.
   Each instance has its own separate memory for this variable.

3. Usage Context:

   Static Variable:
   Commonly used for constants or properties that should be shared across all instances, such as a counter, configuration values, or any state that should be global to all instances.

   Instance Variable:
   Used for properties that are unique to each instance, such as the attributes of an object.
