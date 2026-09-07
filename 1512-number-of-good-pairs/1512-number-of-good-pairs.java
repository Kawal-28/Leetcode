class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n=nums.length;
        int count=0;
        if(n==1) return 0;
        int i=0;
        int j=i+1;
        
        while(i<n-1){
            if(nums[i]==nums[j]){
                count++;
            }
            j++;
            if(j==n){
                i++;
                j=i+1;
            }
        }
        return count;
    }
}