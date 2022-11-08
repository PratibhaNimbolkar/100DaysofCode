When a subclass inherits from a superclass, it also inherits its methods; however, it can also override the superclass methods (as well as declare and implement new 
ones).
Consider the following Sports class:

class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
Next, we create a Soccer class that inherits from the Sports class. We can override the getName method and return a different, subclass-specific string:

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


Note: When overriding a method, you should precede it with the @Override annotation. The parameter(s) and return type of an overridden method must be exactly
the same as those of the method inherited from the supertype.


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

Task
Complete the code in your editor by writing an overridden getNumberOfTeamMembers method that prints the same statement as the superclass'
getNumberOfTeamMembers method, except that it replaces  with  (the number of players on a Soccer team).

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


Output 


When executed, your completed code should print the following:

Generic Sports
Each team has n players in Generic Sports
Soccer Class
Each team has 11 players in Soccer Class
Language
Java 8

101112131415161718192021222392425262728293031323334
}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
        void getNumberOfTeamMembers(){
        System.out.println("Each team has 11 players in Soccer Class");
    }

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

Upload Code as File

Test against custom input
Congratulations!

You have passed the sample test cases. Click the submit button to run your code against all the test cases.


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


Sample Test case 0
Your Output (stdout)
Generic Sports
Each team has n players in Generic Sports
Soccer Class
Each team has 11 players in Soccer Class


Expected Output
Generic Sports
Each team has n players in Generic Sports
Soccer Class
Each team has 11 players in Soccer Class
BlogScoring

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
