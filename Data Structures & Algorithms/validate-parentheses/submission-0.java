class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int TOP = -1;

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch =='{' || ch =='['){
                TOP = TOP + 1;
                stack[TOP] = ch;
            }else{
                if(TOP == -1){
                    return false;
                }
                char open = stack[TOP];
                TOP = TOP - 1;
                if ((ch == ')' && open != '(') ||
    (ch == '}' && open != '{') ||
    (ch == ']' && open != '[')){
        return false;
    }
            }
        }
        if(TOP == -1){
            return true;
        }else{
            return false;
        }
        
    }
}
