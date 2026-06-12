
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '[' || ch == '{' || ch == '('){
                stack.push(ch);
            }else if (ch == ']' || ch == '}' || ch == ')'){
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if(!matches(top, ch)) return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean matches(char open, char close){
        if(open == '(' && close == ')') return true;
        else if(open == '{' && close == '}') return true;
        else if(open == '[' && close == ']') return true;
        else{return false;}
    }
}
