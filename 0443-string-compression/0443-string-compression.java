class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int read=0,write=0;
        while(read<n){
            char ch=chars[read];
            int count=0;
            while(read<n && chars[read]==ch){
                read++;
                count++;
            }
            chars[write++]=ch;

            if(count>1){
                for(char c:String.valueOf(count).toCharArray()){
                    chars[write++]=c;
                }
            }
        }
        return write;

    }
}
        // int i=0,j=1;
        // int count=1;
        // for(int k=0;k<n;i++){
        //     char ch=chars.charAt(k);
        //     if(chars[i]==chars[j]){
        //         count++;
        //         j++;
        //     }else{
        //         chars[k+1]=j-1;
        //         i=j;
        //     }
        // }
        // return chars.length;
