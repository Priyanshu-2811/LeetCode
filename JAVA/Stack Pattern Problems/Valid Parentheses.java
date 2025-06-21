class Solution {
    public boolean isValid(String s) {
        int l=s.length();
        int bal=0;
        Stack<Character> stack = new Stack<>();
        // Looping each character 
        for(int i=0;i<l;i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[')
                stack.push(ch);
            else 
            {
                if(stack.isEmpty())
                    return false;
                char ch1=stack.pop();
                if((ch==')' && ch1 !='(') || (ch=='}' && ch1!='{') || (ch==']' && ch1!='['))
                    return false;
            }
        }
        return stack.isEmpty();
    }
}