/* Question : A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward. */

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
