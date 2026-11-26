class Solution {
    public int numberOfSubstrings(String s) {
        int[] frequency=new int[3];
        int left=0;
        int count=0;
        int n=s.length();
        for(int right=0;right<s.length();right++)
        {
            frequency[s.charAt(right)-'a']++;

            while(frequency[0]>1 && 
            frequency[1]>1 && frequency[2]>1)
            {
                count+=n-right;
                frequency[s.charAt(left)-'a']--;
                left++;
            }
        }
        return count;
         
    }
}
