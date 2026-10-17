the logic of this problem that is we have to count the cardpoints that are to be maximum but we have to choose either from front and Backside

my logic is that first have to calculate the sum of first or front k elements sum and store it after that u have  to remove the last element
from current sized k window sum and add last element from right end side or back side  and after that compare the both currentsum and previous
sum that are currentSum and maxSum repeat this process until the k value becomes zero 
lastly return the maxScore


Your approach
You can pick exactly k cards, choosing cards only from the front or the back.
Your idea is:
1. Calculate the sum of the first k cards and store it in maxSum.
2. Remove one card from the left side of your current selection.
3. Add one card from the right end of the array.
4. Calculate the updated sum and compare it with maxSum.
5. Repeat until all k cards have been replaced by cards from the back.
6. Return maxSum.
