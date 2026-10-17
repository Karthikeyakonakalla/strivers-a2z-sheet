class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        
        int maxLength=0;
        int left=0;
        for(int i=0;i<s.length();i++)
        {
            char current=s.charAt(i);
            if(map.containsKey(current)&& map.get(current)>=left )
            {
                maxLength=Math.max(maxLength,i-map.get(current));
                left=map.get(current)+1;
                 map.put(current,i);
            }
            maxLength=Math.max(i-left+1,maxLength);
            map.put(current,i);
        }
        return maxLength;
        

    }
}
