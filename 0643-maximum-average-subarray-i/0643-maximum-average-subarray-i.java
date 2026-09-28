class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        //int avg=0;
        int currSum=0;
        for(int i=0;i<k;i++){
            currSum=currSum+nums[i];
        }
        int maxSum=currSum;
        for(int i=k;i<n;i++){
            currSum+=nums[i]-nums[i-k];

            if(currSum>maxSum){
            maxSum=currSum;}
        }
        return (double)maxSum/k;
    }
}