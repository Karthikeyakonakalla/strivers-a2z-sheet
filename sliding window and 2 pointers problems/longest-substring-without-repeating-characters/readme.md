the logic is about there are 2 things 1 window and another left pointer 
left pointer tells the starting point of the window  and window tells the unique characters window
we put the hashmap for the last seen of every variable in the string 
whenever we encounters the already seen variable then updates the left pointer with to the next variable index upfates the lastseen hashmap with
the new variable that we encountered index now
calculate the maxLength from left to current variable index

Longest Substring Without Repeating Characters
1. Initialize a HashMap to store the last-seen index of each character.
2. Initialize left = 0 and maxLength = 0.
3. Traverse the string using pointer i from 0 to s.length() - 1.
4. For each character:
   - Check whether the character exists in the HashMap and its last-seen index is greater than or equal to left.
   - If yes, update left = map.get(current) + 1.
5. Update the HashMap with the current character and its index: map.put(current, i).
6. Calculate the current window length: i - left + 1.
7. Update maxLength with the maximum of the current window length and the previous maximum.
8. Repeat until the entire string is traversed.
9. Return maxLength.
Time Complexity: \(O(n)\)
Space Complexity: \(O(\min(n, |\Sigma|))\)
