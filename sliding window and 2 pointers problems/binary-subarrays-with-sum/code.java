class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count=0,currentSum=0;
        for(int start=0;start<nums.length;start++)
        {
            currentSum=0;
            for(int end=start;end<nums.length;end++){
                currentSum+=nums[end];
                if(currentSum==goal){
                    count++;
                }
                if(currentSum>goal){
                    break;
                }
            }
        }
        return count;
    }
}
