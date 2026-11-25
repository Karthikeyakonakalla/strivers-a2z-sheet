class Solution {
    public String minWindow(String s, String t) {
    
    int n=s.length();
    int m=t.length();
    int matched=0;


    if(n==0 || m==0 || m>n)
    {
        return "";
    }

    int[] need=new int[256];
    int[] window=new int[256];


    for(int i=0;i<m;i++)
    {
        need[t.charAt(i)]++;    
    }
    int left=0;
    int startIndex=0;
    int minLength=Integer.MAX_VALUE;

    for(int right=0;right<s.length();right++)
    {
        char currentCharacter=s.charAt(right);

        window[currentCharacter]++;

        if(need[currentCharacter] > 0 && window[currentCharacter] <= need[currentCharacter]){
            matched++;
        }

        while(matched == m)
        {
            int currentLength=right-left+1;
            if(currentLength < minLength){
             //   System.out.println(s.substring(left,left+minLength));

                minLength=currentLength;
                startIndex=left;
            }

            char leftChar=s.charAt(left);
            window[leftChar]--;
            if(need[leftChar] > 0 && need[leftChar] > window[leftChar]){
                matched--;
            }
            left++;
        }

    }

        if(minLength == Integer.MAX_VALUE){
            return "";
        }
        System.out.println(startIndex);
        System.out.println(minLength);
        return s.substring(startIndex,startIndex+minLength);


    }
}
