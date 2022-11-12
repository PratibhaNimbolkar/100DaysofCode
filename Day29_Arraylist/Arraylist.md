Arraylist : Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


Problem : You are given n lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in yth 
          position of xth line.
           Take your input from System.in.
           
    
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
  
Input Format
The first line has an integer n . In each of the next n lines there will be an integer d denoting number of integers on that line and then there will be
d space-separated integers. In the next line there will be an integer q denoting number of queries. Each query will consist of two integers x and y.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
        
Constraints:
1<=n<=20000
0<=d<=50000
1<=q<=1000
1<=x<=n

Each number will fit in signed integer.
Total number of integers in n lines will not cross 10^5 .

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

Output Format
In each line, output the number located in yth position of xth line. If there is no such position, just print "ERROR!"

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

Test case1

Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5

Output

74
52
37
ERROR!
ERROR!

Testcase2

Input

8
7 43 35 26 34 78 99 70
3 71 11 16
8 70 19 42 30 84 20 57 45
0
1 20
0
0
0
10
5 1
5 7
1 7
5 3
5 2
4 7
5 2
1 2
4 1
2 3

Output

20
ERROR!
70
ERROR!
ERROR!
ERROR!
ERROR!
35
ERROR!
16

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

