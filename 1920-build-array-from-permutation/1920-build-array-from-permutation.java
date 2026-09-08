class Solution {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        int [] res=new int[n];
        for(int i=0;i<n;i++){
            int x=nums[i];
            res[i]=nums[x];
        }
        return res;
    }
}