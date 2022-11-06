Problem : You are given an interface AdvancedArithmetic which contains a method signature int divisor_sum(int n). You need to write a class called MyCalculator
          which implements the interface.divisorSum function just takes an integer as input and return the sum of all its divisors. For example divisors of 6 are
          1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be at most 1000.
          Solution : import java.util.*;
             interface AdvancedArithmetic{
             int divisor_sum(int n);
             }
             class MyCalculator implements AdvancedArithmetic {
             public  int divisor_sum(int n){
             int ans = 0;
             for (int i =1;i<=n;i++) {
             if (n%i==0)
                ans = ans+i;
                }
            return ans;
             } 
    
          }

        class Solution{
        public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    /*
       ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------
          


Interface : A Java interface can only contain method signatures and fields. The interface can be used to achieve polymorphism.


------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Explanation

Divisors of 6 are 1,2,3 and 6. 1+2+3+6=12.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Testcase1
Input 
6
Output
I implemented: AdvancedArithmetic
12

Testcase2
Input
1
Output
I implemented: AdvancedArithmetic
1

Testcase3
Input
20
Output
I implemented: AdvancedArithmetic
42

Testcase4
Input
200
Output
I implemented: AdvancedArithmetic
465
----------------------------------------------------------------------------------------------------------------------------------------------------------------------
