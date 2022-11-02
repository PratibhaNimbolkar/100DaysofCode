  Problem : Reads an integer from stdin and saves it to a variable,n, denoting some number of integers.
            Reads n integers corresponding to a0,a1,.......an-1 from stdin and saves each integer ai to a variable, val .
            Attempts to print each element of an array of integers named a .
            Write the following code in the unlocked portion of your editor:
            Create an array,a, capable of holding n integers.
            Modify the code in the loop so that it saves each sequential value to its corresponding location in the array. For example, the first value must be stored in,
            the second value must be stored in , a1 and so on
            
 Array : An array is a simple data structure used to store a collection of data in a contiguous block of memory. Each element in the collection is accessed using an 
         index, and the elements are easy to find because they're stored sequentially in memory.
         Because the collection of elements in an array is stored as a big block of data, we typically use arrays when we know exactly how many pieces of data we're 
         going to have. For example, you might use an array to store a list of student ID numbers, or the names of state capitals. 
         
Input Format
         The first line contains a single integer,n, denoting the size of the array.
         Each line i of the n subsequent lines contains a single integer denoting the value of element ai .

Output Format
         You are not responsible for printing any output to stdout. Locked code in the editor loops through array a and prints each sequential element on a new line.
         
Testcase1
Input
5
10
20
30
40
50
Output
10
20
30
40
50

Testcase2
Input
3
100
200
100
Output
100
200
100

Explanation : 
         When we save each integer to its corresponding index in a, we get a = [10,20,30,40,50] . The locked code prints each array element on a new line from left
         to right.
