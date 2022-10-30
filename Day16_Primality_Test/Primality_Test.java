/*Given a large integer,n , use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution{
public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
      BigInteger bi = new BigInteger(sc.next());
       boolean result = bi.isProbablePrime(1);
        if (result==true) {
             System.out.println("prime");
              } else { 
                  System.out.println("not prime"); } }
}
