# strivers-a2z-sheet
maintain my own code 


Sliding Window and Two Pointers are two important problem-solving techniques in DSA. They are related, but they are not exactly the same.

Let's organize the different patterns you should learn for coding interviews.
1. Two Pointers Technique
Two pointers means using two index variables to traverse or process a data structure efficiently.
Common patterns
Pattern	How it works	Common problems
Opposite direction	One pointer starts at the beginning, another at the end	Two Sum II, Container With Most Water
Same direction	Both pointers move from left to right	Remove Duplicates, Remove Element
Fast and slow	One pointer moves faster than the other	Linked List Cycle, Middle of Linked List
Read and write pointers	One reads elements, another tracks the position to write	Move Zeroes, Remove Duplicates
Two arrays	One pointer for each array	Merge Sorted Array, Intersection of Two Arrays























9











2. Sliding Window Technique
Sliding Window is generally used to process continuous portions of an array or string (subarrays or substrings).

We maintain a window using two pointers:
- left – Starting boundary.
- right – Ending boundary.
Common patterns
Pattern	How it works	Common problems
Fixed-size window	Window size remains constant	Maximum Average Subarray I
Variable-size window	Expand and shrink based on a condition	Minimum Size Subarray Sum
Longest valid window	Find the longest window satisfying a condition	Longest Substring Without Repeating Characters
Minimum valid window	Find the smallest window satisfying a condition	Minimum Window Substring
Count subarrays using AtMost	Count valid windows using right - left + 1	Binary Subarrays With Sum
Exactly K technique	AtMost(K) - AtMost(K-1)	Count Number of Nice Subarrays
Frequency-based window	Maintain character frequencies	Permutation in String, Find All Anagrams























9











3. Important Sliding Window sub-patterns
These are particularly important to understand:

A. Fixed-size sliding window

Example: Maximum sum of a subarray of size K.
- Add the new right element.
- Remove the element that goes out of the window.
- Maintain a fixed window size.
B. Variable-size sliding window

Example: Minimum Size Subarray Sum.
- Expand using right.
- If the condition is satisfied, shrink using left.
- Update the answer.
C. Frequency-based sliding window

Example: Longest Substring Without Repeating Characters.
- Maintain a frequency array or HashMap.
- Expand the window.
- Shrink when a duplicate violates the condition.
D. AtMost technique

Example: Binary Subarrays With Sum.
\[
Exactly(K)=AtMost(K)-AtMost(K-1)
\]

- Calculate the number of subarrays with at most K.
- Calculate the number with at most K-1.
- Subtract both results.
