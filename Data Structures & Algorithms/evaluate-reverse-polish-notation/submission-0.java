class Solution {
    

    public int evalRPN(String[] tokens) {
        Stack <Integer> stack = new Stack<>();
        for (String s : tokens){
            if (s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*")){
                int num2 = stack.pop();
                int num1 = stack.pop();
                int results = 0;
                if (s.equals("+")){
                    results = num1 + num2;
                    stack.push(results);
                }
                if (s.equals("-")){
                    results = num1 - num2;
                    stack.push(results);
                }
                if (s.equals("/")){
                    results = num1 / num2;
                    stack.push(results);
                }
                if (s.equals("*")){
                    results = num1 * num2;
                    stack.push(results);

                }                                
                
            }else{
                int num = Integer.parseInt(s);
                stack.push(num);
            }
        }
        return stack.pop();
    }
}
