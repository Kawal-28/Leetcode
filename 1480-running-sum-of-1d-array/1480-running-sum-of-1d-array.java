class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int [] res=new int[n];
        //res[0]=nums[0];
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            res[i]=sum;
        }
        return res;
    }
}