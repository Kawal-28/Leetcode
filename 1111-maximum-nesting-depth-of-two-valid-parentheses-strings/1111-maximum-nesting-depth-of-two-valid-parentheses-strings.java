class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n=seq.length();
       int [] res=new int [n]; 
       int depth=0;
       for(int i=0;i<n;i++){
        char ch=seq.charAt(i);
        if(ch == '('){
            depth++;
            if(depth%2==1) res[i]=0;
            else res[i]=1;
        }else{
            if(depth%2==1) res[i]=0;
            else res[i]=1;
            depth--;
            
        }
       }
       return res;
    }
}