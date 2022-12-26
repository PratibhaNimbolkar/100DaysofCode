HackerRank Java Tag Content Extractor - Problem Statement In a tag-based language like XML or HTML, contents are enclosed between a start tag and an end tag like contents. Note that the corresponding end tag starts with a /.

Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within sequences of well-organized tags meeting the following criterion:

The name of the start and end tags must be the same. The HTML code

Hello World
is not valid, because the text starts with an h1 tag and ends with a non-matching h2 tag. Tags can be nested, but content between nested tags is considered not valid. For example, in
contentsinvalid
, contents is valid but invalid is not valid. Tags can consist of any printable characters.
Input Format

The first line of input contains a single integer, N (the number of lines). The N subsequent lines each contain a line of text.

Constraints

Each line contains a maximum of 10^4 printable characters. The total number of characters in all test cases will not exceed 10^6. 1 <= N <= 100

Output Format

4

Nayeem loves counseling
Sanjay has no watch
So wait for a while safat codes like a ninja Imtiaz has a secret crush
Sample Output

Nayeem loves counseling Sanjay has no watch So wait for a while None Imtiaz has a secret crush
