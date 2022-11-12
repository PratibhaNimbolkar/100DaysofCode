/*You are given n lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in yth position of xth
line.
Take your input from System.in.*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);

    int total=scan.nextInt();

    ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();

    for(int i=0;i<total;i++)
    {
     int size=scan.nextInt();
     ArrayList<Integer> list=new ArrayList();

     for(int j=0;j<size;j++)
       {
          int item=scan.nextInt();
          list.add(item);
       }
      mainlist.add(list);
   }

    int totalprint=scan.nextInt();
    for(int k=0;k<totalprint;k++)
    {
      int row=scan.nextInt();
      int col=scan.nextInt();
      try
       {
       System.out.println(mainlist.get(row-1).get(col-1));
       }
      catch(Exception e)
      {
      System.out.println("ERROR!");
      }
    }
    scan.close();
    }
}
