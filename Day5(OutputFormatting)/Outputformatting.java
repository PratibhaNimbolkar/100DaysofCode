/*Problem : Every line of input will contain a String followed by an integer.
Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from 0 to 999 .



import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                 System.out.printf("%-15s" , s1);
                 System.out.printf("%03d" , x);
                 System.out.println();
                                  
    
            }
            System.out.println("================================");

    }
}
