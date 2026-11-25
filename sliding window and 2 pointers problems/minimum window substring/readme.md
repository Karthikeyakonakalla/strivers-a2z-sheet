# Minimum Window Substring – Sliding Window Approach

### 1. Edge Cases

- If `s` or `t` is empty, return an empty string.
- If the length of `t` is greater than the length of `s`, return an empty string.

### 2. Hashing Data Structures

We need two hashing data structures:

- **`need[]`**: Stores the frequency of every character present in the target string `t`.
- **`window[]`**: Dynamically stores the frequency of every character present in the current sliding window of `s`.

### 3. Initialize the Required Character Frequencies

First, traverse the target string `t` and calculate the frequency of every character. Store these frequencies in the `need[]` array.

### 4. Initialize Two Pointers

We use two pointers:

- `left` – Represents the starting position of the current window.
- `right` – Represents the ending position of the current window.

Initially, both pointers start at index `0`.

### 5. Expand the Window Using the Right Pointer

Increment the `right` pointer and include the current character in the window.

For every character:

1. Update its frequency in the `window[]` array.
2. Check whether the current character exists in the `need[]` array.
3. If it is a required character and its frequency in the current window is less than or equal to its required frequency, increment `matched`.

This ensures that we count only the required occurrences of each character.

### 6. Check Whether the Current Window Is Valid

Continue expanding the window until:

`matched == m`

Here, `m` represents the length of the target string `t`.

When `matched == m`, it means the current window contains all the required characters, including duplicates.

### 7. Update the Minimum Window Length

Once the current window becomes valid:

1. Calculate the current window length using `right - left + 1`.
2. Compare it with the existing `minLength`.
3. If the current window is smaller, update `minLength` and store its starting index in `startIndex`.

### 8. Shrink the Window Using the Left Pointer

After updating the minimum window, try to reduce its size by removing the leftmost character.

1. Get the character at the `left` pointer.
2. Decrease its frequency in the `window[]` array.
3. Check whether the removed character exists in the `need[]` array.
4. If it is a required character and its current window frequency becomes less than its required frequency, decrement `matched`.

This indicates that the current window is no longer valid because it has lost one of its required character occurrences.

Finally, increment the `left` pointer to shrink the window.

Repeat this process until the window becomes invalid. Then continue expanding using the `right` pointer.

### 9. Return the Result

After traversing the entire string:

- If no valid window was found, return an empty string.
- Otherwise, return the substring using the stored `startIndex` and `minLength`.

### Time and Space Complexity

- **Time Complexity:** O(n + m), because both pointers traverse the string at most once, and we initially traverse the target string to build the frequency array.
- **Space Complexity:** O(1), because we use two fixed-size frequency arrays for the English character set.
