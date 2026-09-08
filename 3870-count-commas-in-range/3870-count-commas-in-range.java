class Solution {
    public int countCommas(int n) {
      int res=0;
      if(n<999) return 0;
      res=n-1000;
      return res+1;  
    }
}