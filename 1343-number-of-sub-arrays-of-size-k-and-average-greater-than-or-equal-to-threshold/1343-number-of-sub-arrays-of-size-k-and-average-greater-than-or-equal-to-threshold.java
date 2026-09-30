class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length;
        int currSum=0;
        int count=0;
        for(int i=0;i<k;i++){
            currSum+=arr[i];
        } if(currSum>=threshold*k) count++;

        for(int i=k;i<n;i++){
            currSum+=arr[i]-arr[i-k];
            if(currSum>=threshold*k) count++;
        }
        return count;
    }
}