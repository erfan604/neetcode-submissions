// Create an array 'result' of same length as temperatures, initialized to 0
// Create an empty stack (will store indices)

// Loop through temperatures from index 0 to end:
    
//     While stack is NOT empty AND current temperature > temperature at stack.top():
//         Pop an index from the stack
//         Calculate days = current index - popped index
//         Set result[popped index] = days
    
//     Push current index onto stack

// Return result

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack <Integer> stack = new Stack<>();
        int result[] = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int poppedIndex = stack.pop();
                int days = i - poppedIndex;

                result[poppedIndex] = days;
            }
            stack.push(i);
        }
        return result;
    }
}
