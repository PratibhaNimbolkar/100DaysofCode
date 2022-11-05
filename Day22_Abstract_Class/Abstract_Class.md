Problem : You have to create another class that extends the abstract class. Then you can create an instance of the new class.
          Notice that setTitle method is abstract too and has no body. That means you must implement the body of that method in the child class.
          
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
          
Abstract Class : A Java abstract class is a class that can't be instantiated. That means you cannot create new instances of an abstract class. It works as a base for 
                 subclasses.
                 
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  
Following is an example of abstract class:
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Test case 1
Input
A tale of two cities

Output
The title is: A tale of two cities

Test Case 2
Input (stdin)
Sonar tori

Your Output (stdout)
The title is: Sonar tori
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
