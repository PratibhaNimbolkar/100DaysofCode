Function Description :

Complete the getSmallestAndLargest function in the editor below.
getSmallestAndLargest has the following parameters:
string s: a string
int k: the length of the substrings to find

Returns :
string: the string ' + "\n" + ' where and are the two substrings.

Input Format

The first line contains a string denoting s.
The second line contains an integer denoting k.

Sample Input 
welcometojava
3

Sample Output 
ava
wel

Explanation
String s = "Welcome to java"  has the following lexicographically-ordered substrings of length k=3 :
["ava" , "com","elc","eto","jav","lco","met","oja"]
We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).
The stub code in the editor then prints ava as our first line of output and wel as our second line of output.
