/*Given a list, L , of N integers, perform Q queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            int ele = scanner.nextInt();
            arr.add(ele);
        }
        int q=scanner.nextInt();       
        for(int i=0;i<q;i++){
            String input = scanner.next();
            if(input.equals("Insert")){
                // System.out.println("Insert");
                int index=scanner.nextInt();
                int ele=scanner.nextInt();
                arr.add(index,ele);
            }
            if (input.equals("Delete")){
                // System.out.println("Insert2");
                int index=scanner.nextInt();
                arr.remove(index);
            }
        }
        for(Integer a:arr){
            System.out.print(a + " ");
        }
    }
}
