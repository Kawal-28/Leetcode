class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=cardPoints[i];
        }
        int currSum=0;
        if (k == n) return sum;
        int windowSize=n-k;
        for(int i=0;i<windowSize;i++){
            currSum+=cardPoints[i];
        }
        int min=currSum;
        for(int i=windowSize;i<n;i++){
            currSum=currSum+cardPoints[i]-cardPoints[i-windowSize];
            min=Math.min(currSum,min);
        }
        return sum-min;
    }
}