class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0,right=0;
       HashMap<Character,Integer> map=new HashMap<>();
       int maxLen=0;
        while(right < s.length())
        {
           char currentChar=s.charAt(right);
           if(map.get(currentChar) != null){
                if(map.get(currentChar)>=left)
                {
                    left=map.get(currentChar)+1;
                }
           }
            map.put(currentChar,right);
            maxLen=Math.max(maxLen,right-left+1);
            right++;

        }
        return maxLen;
    }
}


class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0,right=0;
        int[] map=new int[256];
        Arrays.fill(map,-1);
       // System.out.println(Arrays.toString(map));
       int maxLen=0;
        while(right < s.length())
        {
           char currentChar=s.charAt(right);
            if(map[currentChar]>=left)
            {
                left=map[currentChar]+1;
            }
            map[currentChar]=right;
            maxLen=Math.max(maxLen,right-left+1);
            right++;

        }
        return maxLen;
    }
}
