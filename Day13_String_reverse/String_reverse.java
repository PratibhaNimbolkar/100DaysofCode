/*Given a string A, print Yes if it is a palindrome, print No otherwise.*/



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String rev = "";
        for (int i = 0; i < A.length(); i++) {
        char s = A.charAt(i);
        rev = s+rev;
    }
        
        if(rev.compareTo(A)==0){
        System.out.println("Yes");
        } 
        else System.out.println("No");
    
      }
      
    }
