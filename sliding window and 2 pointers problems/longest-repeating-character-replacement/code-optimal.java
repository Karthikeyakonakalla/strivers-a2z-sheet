class Solution {
    public int characterReplacement(String s, int k) { 
        int maxLength=0;
        int left=0;
        int[] frequency=new int[26];
        int maxfrequency=0;
        for(int right=0;right<s.length();right++)
        {
            char c=s.charAt(right);
            int index=c-'A';
            frequency[index]++;
            maxfrequency = Math.max(maxfrequency,frequency[index]);
            if(right-left+1-maxfrequency > k )
            {
                frequency[s.charAt(left)-'A']--;
                left++;
            }
            maxLength=Math.max(right-left+1,maxLength);
        }
            return maxLength;
    }
}
