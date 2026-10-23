The Problem is we have a string and a k value atmost we can do k changes to any character to character we have to find the longest string 
that contains all of a same single repeating character

Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.

Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.


Approach : 
Sliding window that has 2  pointer one left stays at starting and right is moving pointer 

we moves right , along with that  we stores the current character count by  increasing the count  in frequency map or at some hash

the current window is from left to right 

we have to see the size of the current window i.e. from left to right if the current window has failed to maintain the required conditions 
like in current window if there are more than different k characters we will find out this by  maxfrequency = Math.max(maxfrequency,frequency[index]);
then we have to decrease the size of window by increasing the left pointer 
and at same time we have to decrease the frequency count of the left positioned character after that

we have to compare the maxLength update with
current window length and maxLength 
