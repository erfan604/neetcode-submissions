
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        Map<Character, Character> pairs = new HashMap<>();
        pairs.put(')', '(');
        pairs.put(']', '[');
        pairs.put('}', '{');

        for(char c : s.toCharArray()){
            if (c == '{' || c == '[' || c == '('){
                stack.push(c);
            }else if(stack.isEmpty() || !stack.pop().equals(pairs.get(c))){
                return false;
            }
            
        }
        if (stack.isEmpty()){
            return true;
        }
        return false;
    }
}
