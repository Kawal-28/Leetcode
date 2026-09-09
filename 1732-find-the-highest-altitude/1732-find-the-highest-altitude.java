class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int[] res=new int[n+1];
        for(int i=0;i<n;i++){
            res[i+1]=res[i]+gain[i];
        }
        return Arrays.stream(res).max().getAsInt();
    }
}