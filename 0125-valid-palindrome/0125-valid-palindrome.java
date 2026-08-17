class Solution {
    // Helper function to check if a StringBuilder is a palindrome
    private boolean checkPalindrome(StringBuilder str) {
        int n = str.length();
        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // Main solution function called by LeetCode
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                str.append(Character.toLowerCase(ch));
            }
        }

        return checkPalindrome(str);  
    }
}