class Solution {
    public boolean detectCapitalUse(String word) {
        int n=word.length();
        int count=0;
        for(int i=0;i<n;i++){
            if(Character.isUpperCase(word.charAt(i))){
                count++;
            }
        }
        return count==0 || count==n || count==1 && Character.isUpperCase(word.charAt(0));
    }
}