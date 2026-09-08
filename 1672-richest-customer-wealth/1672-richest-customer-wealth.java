class Solution {
    public int maximumWealth(int[][] accounts) {
        int x=accounts.length;
       // int y[0]=accounts.length;
       int prevSum=0;
        for(int i=0;i<x;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }
            prevSum=Math.max(sum,prevSum);
        }
        return prevSum;
    }
}