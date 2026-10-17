class Solution {
    public int maxScore(int[] cardPoints, int k) {

        if(k>cardPoints.length || k<0 )
        {
            return -1;
        }
        if(k== 0)
        {
            return 0;
        }
        int leftSum=0,rightSum=0;
        for(int i=0;i<k;i++)
        {
            leftSum+=cardPoints[i];
        }
        int rightIndex=1;
        int maxScore=leftSum;
        int n=cardPoints.length;
        int currentScore=0;
        for(int i=k-1;i>=0;i--)
        {
            leftSum-=cardPoints[i];
            rightSum+=cardPoints[n-rightIndex];
            rightIndex++;

            currentScore=leftSum+rightSum;

            if(maxScore < currentScore)
            {
                maxScore=currentScore;
            }

        }
        return maxScore;


    }
}
