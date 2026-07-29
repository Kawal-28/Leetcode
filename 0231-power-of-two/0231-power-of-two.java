class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n>0) && (n & (n-1)) ==0;
        
        // while(n%2==0){
        //     // if(n==0) return true;
        //     // if(n%2 ==1) return false;
        //     n/=2;
        // }
        // return n==1;
    }
}