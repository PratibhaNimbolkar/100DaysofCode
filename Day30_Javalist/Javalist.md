Problem : 
Given a list, L , of N integers, perform Q queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.
For this problem, we have  types of queries you can perform on a List:

Insert y at x index :

Insert

x y


Delete the element at index x :

Delete

x
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Input Format

The first line contains an integer, N (the initial number of elements in L).
The second line contains N space-separated integers describing L .
The third line contains an integer, Q  (the number of queries).
The 2Q subsequent lines describe the queries, and each query is described over two lines:

If the first line of a query contains the String Insert, then the second line contains two space separated integers x y, and the value y must be inserted into L
at index x.
If the first line of a query contains the String Delete, then the second line contains index x, whose element must be deleted from L.


---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Constraints : 

 1<=N<=4000
 
 1<=Q<=4000
 
 Each element in is a 32-bit integer
 
 ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
 Output
 
 Print the updated list L as a single line of space-separated integers.
 
 ----------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
 Test case1
 Input
 
 5
12 0 1 78 12
2
Insert
5 23
Delete
0

Output
0 1 78 12 23

Testcase2

Input
11
27358 39344 71551 99795 97548 77891 28014 1546 24269 38550 23153
10
Insert
3 15097
Delete
0
Insert
1 25282
Insert
7 13736
Insert
10 50299
Delete
11
Insert
5 13902
Insert
2 58695
Insert{-truncated-}

Output
39344 25282 58695 71551 15097 99795 13902 97548 77891 44009 13736 1546 50299 38550 23153

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


 
