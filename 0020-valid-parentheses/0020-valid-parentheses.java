class Solution {
    public boolean isValid(String s) {
        Stack <Character> st=new Stack<>();
        int len=s.length();
        for(int i=0;i<len;i++){
            char str=s.charAt(i);
            if(str=='(' || str=='{' || str=='['){
                st.push(str);
            }else {
                if (st.isEmpty()) return false;
                char top=st.pop();
                if(str==')' && top!='(') return false;
                if(str==']' && top!='[') return false;
                if(str=='}' && top!='{') return false;
            }
        }
        return st.isEmpty();
    }
}