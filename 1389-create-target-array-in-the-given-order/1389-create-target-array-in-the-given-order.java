class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        ArrayList<Integer> res=new ArrayList<>();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            
            res.add(index[i],nums[i]);
        }
        for(int i=0;i<res.size();i++){
            arr[i]=res.get(i);
        }
        return arr;
    }
}