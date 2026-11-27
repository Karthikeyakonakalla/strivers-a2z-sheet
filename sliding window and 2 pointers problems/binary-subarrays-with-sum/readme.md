Binary Subarrays With Sum – Brute Force Approach
Approach
We use two nested loops to generate all possible continuous subarrays and count the subarrays whose sum is equal to the given goal.
1. Outer loop – Fix the starting point:
   - The first loop iterates through the array and fixes the starting index of each possible subarray.
2. Inner loop – Perform operations on the fixed starting point:
   - The second loop traverses the remaining elements from the fixed starting index.
   - Calculate currentSum by adding each element to the previous sum.
3. Check the current sum:
   - If currentSum == goal, increment the count variable because we have found a valid subarray.
   - If currentSum > goal, break the inner loop because the array contains only 0s and 1s, so the sum cannot decrease.
   - Otherwise, continue expanding the subarray by adding the next element.
4. Return the result:
   - After both loops finish, the count variable contains the total number of continuous subarrays whose sum is equal to the given goal.
