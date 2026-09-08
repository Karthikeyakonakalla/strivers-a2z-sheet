the problem is there are fruit trees in a row they are different fruit trees has there own type of fruits u have fill it into the baskets that they give you only 2 baskets u can fill unlimited amount of fruits in basket 

Problem Statement: There is only one row of fruit trees on the farm, oriented left to right. An integer array called fruits represents the trees, where fruits[i] denotes the kind of fruit produced by the ith tree.
The goal is to gather as much fruit as possible, adhering to the owner's stringent rules :

There are two baskets available, and each basket can only contain one kind of fruit. The quantity of fruit each basket can contain is unlimited.
Start at any tree, but as you proceed to the right, select exactly one fruit from each tree, including the starting tree. One of the baskets must hold the harvested fruits.
Once reaching a tree with fruit that cannot fit into any basket, stop.

We can do better by applying the sliding window technique. The idea is to maintain a window that contains at most 2 distinct fruit types, and whenever the condition is violated, shrink the window from the left until it's valid again. We use a hash map to track the count of each fruit in the current window. This allows us to scan the array only once from left to right, and adjust the window dynamically in linear time.

Initialize two pointers for the window: start and end.
Use a hash map to store the frequency of each fruit type within the current window.
Iterate through the array using the end pointer.
Add the current fruit to the map and update its count.
If the map size exceeds 2 (more than 2 fruit types in window), shrink the window from the start pointer until the map becomes valid (size ≤ 2).
At each step, track the maximum length of the valid window.
