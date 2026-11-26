Count Substrings Containing All Three Characters (a, b, c)
The approach is Sliding Window with Two Pointers.

The goal is to count the total number of substrings that contain at least one occurrence of all three characters: a, b, and c.
Approach
We use two pointers, left and right, along with a frequency map to track the occurrences of a, b, and c in the current window.
1. Initialize two pointers: Set both left and right to index 0.
2. Expand the window using the right pointer: Move the right pointer forward and update the frequency of each character (a, b, and c) in the frequency map.
3. Check whether all three characters are present: Whenever the current window (between left and right) contains at least one occurrence of all three characters, we have found a valid window.
4. Count the valid substrings: Once all three characters are present, calculate the number of valid substrings starting at the current left index using:
   
   count += (string.length() - right);
   
   Why?
   
   Once a window from left to right contains all three characters, every substring starting at left and ending at right or any position after right will also contain all three characters.
   
   Therefore, the number of valid substrings is n - right.
5. Shrink the window from the left: After updating the count, decrease the frequency of the character at the left pointer by 1 and increment left.
6. Check the validity again:
   - If all three characters are still present, repeat steps 4 and 5.
   - If any required character is missing, stop shrinking and expand the window again using the right pointer.
7. Repeat: Continue this process until the right pointer reaches the end of the string.
