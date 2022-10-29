Using Regex, we can easily match or search for patterns in a text. Before searching for a pattern, we have to specify one using some well-defined syntax.

Problem :
In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Input Format

The first line of input contains an integer N , denoting the number of test cases. The next N lines contain a string of any printable characters representing the
pattern of a regex.


Output Format

For each test case, print Valid if the syntax of the given pattern is correct. Otherwise, print Invalid. Do not print the quotes.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Test case 1
input :
3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat
 output:
Valid
Invalid
Invalid

Test case 2
Input (stdin)

Download
5
([a]+)(.+)
[.]+
[.]*
[ ]*
[AAAAAAAAAAAAAAAAAAAAAAAA]*

Output
Valid
Valid
Valid
Valid
Valid
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
