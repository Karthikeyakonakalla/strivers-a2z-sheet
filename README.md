# Sliding Window and Two Pointers – DSA Patterns

## 1. Two Pointers Technique

The Two Pointers technique uses two indexes or pointers to traverse a data structure, usually an array or string, to solve problems efficiently.

### Types of Two Pointers

| Pattern | Description | Common Use Case |
|---|---|---|
| Opposite Direction | One pointer starts at the beginning and another at the end. They move towards each other. | Pair sum in a sorted array, reversing an array |
| Same Direction | Both pointers start from the beginning and move forward at different speeds. | Removing duplicates, merging arrays |
| Fast and Slow Pointers | Two pointers move at different speeds. | Detecting cycles in linked lists |
| Read and Write Pointers | One pointer reads elements while another tracks the position where valid elements should be written. | Removing duplicates, moving zeroes |
| Two Arrays Pointers | Each pointer traverses a different array. | Merging two sorted arrays |

---

## 2. Sliding Window Technique

Sliding Window is used to solve problems involving **contiguous subarrays or substrings**.

Instead of repeatedly calculating the result for every possible subarray, we maintain a window and update it as the pointers move.

### Types of Sliding Window

#### 2.1 Fixed Size Sliding Window

- The window size remains constant.
- Expand the window by moving the right pointer.
- Remove the element at the left pointer when the window exceeds the required size.
- Update the answer for each valid window.

**Common problems:**
- Maximum sum subarray of size K
- Average of all subarrays of size K
- Maximum number of vowels in a substring of size K

#### 2.2 Variable Size Sliding Window

- The window size changes dynamically.
- Expand the window by moving the right pointer.
- If the condition becomes invalid, shrink the window by moving the left pointer.
- Update the answer whenever the window satisfies the required condition.

**Common problems:**
- Longest Substring Without Repeating Characters
- Minimum Window Substring
- Longest Subarray with Sum at Most K (for non-negative elements)

#### 2.3 Longest Valid Window

- Expand the window while traversing the array or string.
- Shrink the window whenever the condition becomes invalid.
- Update the maximum window length whenever the condition is satisfied.

**Common problems:**
- Longest Substring Without Repeating Characters
- Max Consecutive Ones III
- Longest Repeating Character Replacement

#### 2.4 Minimum Valid Window

- Expand the window until it satisfies the required condition.
- Once valid, update the minimum window length.
- Shrink the window while it remains valid.
- Continue until the entire array or string is traversed.

**Common problems:**
- Minimum Size Subarray Sum
- Minimum Window Substring

#### 2.5 Frequency-Based Sliding Window

- Maintain a frequency array or HashMap to track the elements in the current window.
- Expand the window and update frequencies.
- Shrink the window when the required frequency condition is violated.

**Common problems:**
- Permutation in String
- Find All Anagrams in a String
- Minimum Window Substring

#### 2.6 At Most K Technique

This technique is useful when a problem asks for the number of subarrays or substrings containing **exactly K** elements satisfying a condition.

**Formula:**

```text
Exactly(K) = AtMost(K) - AtMost(K - 1)
```

**Approach:**
1. Write a helper function to count subarrays satisfying the condition with at most K elements.
2. Calculate the count for K.
3. Calculate the count for K - 1.
4. Subtract both results.

**Common problems:**
- Binary Subarrays With Sum
- Subarrays with K Different Integers
- Count Number of Nice Subarrays

---

## 3. How to Identify the Pattern

| Problem Statement Clue | Pattern to Consider |
|---|---|
| Find a pair in a sorted array | Two Pointers |
| Reverse an array or string | Opposite Direction Two Pointers |
| Detect a cycle in a linked list | Fast and Slow Pointers |
| Remove duplicates in-place | Read and Write Pointers |
| Find a contiguous subarray or substring | Sliding Window |
| Find maximum/minimum sum for a window of size K | Fixed Size Sliding Window |
| Find the longest valid substring or subarray | Variable Size Sliding Window |
| Find the smallest window satisfying a condition | Minimum Valid Window |
| Track character or element frequencies | Frequency-Based Sliding Window |
| Count subarrays with exactly K elements | At Most K Technique |

**Important:** Not every subarray problem can be solved using Sliding Window. For example, a standard sum-based sliding window may not work when the array contains negative numbers because the sum does not change predictably when the window expands or shrinks.

---

## 4. Practice Problems Checklist

### Two Pointers

- [ ] Two Sum II – Input Array Is Sorted
- [ ] 3Sum
- [ ] Container With Most Water
- [ ] Remove Duplicates from Sorted Array
- [ ] Move Zeroes
- [ ] Valid Palindrome

### Fixed Size Sliding Window

- [ ] Maximum Average Subarray I
- [ ] Maximum Number of Vowels in a Substring of Given Length
- [ ] Find All Anagrams in a String

### Variable Size Sliding Window

- [ ] Longest Substring Without Repeating Characters
- [ ] Minimum Size Subarray Sum
- [ ] Max Consecutive Ones III
- [ ] Longest Repeating Character Replacement

### Frequency-Based Sliding Window

- [ ] Permutation in String
- [ ] Find All Anagrams in a String
- [ ] Minimum Window Substring

### At Most K Technique

- [ ] Binary Subarrays With Sum
- [ ] Count Number of Nice Subarrays
- [ ] Subarrays with K Different Integers

---

## 5. Important Things to Remember

1. **Two Pointers:** Usually uses two indexes to traverse an array, string, or linked list efficiently.
2. **Sliding Window:** A specialized approach for problems involving contiguous elements.
3. **Fixed Window:** Window size remains constant.
4. **Variable Window:** Window size changes based on a condition.
5. **Longest Window:** Expand and shrink whenever the condition becomes invalid.
6. **Minimum Window:** Expand until valid, then shrink while maintaining validity.
7. **Exactly K:** Use `AtMost(K) - AtMost(K - 1)` when the at-most counting function is applicable.
8. **Frequency Window:** Use an array or HashMap to maintain element frequencies.

---

## 6. Complexity

| Technique | Typical Time Complexity | Auxiliary Space |
|---|---|---|
| Two Pointers | O(n) | O(1) |
| Fixed Size Sliding Window | O(n) | O(1) or O(k) |
| Variable Size Sliding Window | O(n) | O(1) or O(k) |
| Frequency-Based Sliding Window | O(n) | O(1) for fixed character sets, otherwise O(k) |
| At Most K Technique | O(n) per helper call | O(1) or O(k) |

*Note: Actual complexity depends on the data structure and the problem requirements. For frequency-based approaches, k represents the number of distinct elements or the size of the tracked character set.*

---

**Goal:** Identify the correct pattern first, understand why the pointers move, and then optimize the solution.
