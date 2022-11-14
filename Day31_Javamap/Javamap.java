/*You are given a phone book that consists of people's names and their phone number. After that you will be given some person's name as query.
For each query, print the phone number of that person.*/

import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        HashMap<String,Integer> h = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
             h.put(name,phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            if(h.get(s)!=null){  System.out.println(s+"=" +h.get(s));}
            else {System.out.println("Not found"); }
         }
            
		}
	}
