class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int left =0,right=0;
        int maxLen=0;
        int zeroCount=0;
        while(right<nums.length)
        {
            int currentDigit=nums[right];
             if(currentDigit == 0)
             {
                zeroCount++;
                if(zeroCount > k)
                {
                    while(zeroCount > k )
                    {
                        if(nums[left]==0){
                            
                            zeroCount--;
                        }
                        left++; 
                    }
                }
             }
             maxLen=Math.max(right-left+1,maxLen);
             right++;
        }
        return maxLen;
    }
}
