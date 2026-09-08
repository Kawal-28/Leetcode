class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int[] copy=Arrays.copyOf(nums,nums.length);
        Arrays.sort(copy); //int count=0;
        HashMap <Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!hm.containsKey(copy[i])){
                hm.put(copy[i],i);
            }
        }
        int [] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]+=hm.get(nums[i]);
        }
        return res;


    }
}
// Original Array
//       ↓
// Make Copy
//       ↓
// Sort Copy
//       ↓
// First occurrence index
//       ↓
// HashMap
//       ↓
// Go through Original Array
//       ↓
// Get answer from HashMap
//       ↓
// Return int[]