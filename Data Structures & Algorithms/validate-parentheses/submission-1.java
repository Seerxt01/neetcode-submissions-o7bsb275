class Solution {
    public boolean isValid(String s) {

        // Create a stack to store opening brackets
        Stack<Character> stack = new Stack<>();

        // Loop through each character in string
        for (char c : s.toCharArray()) {

            // Case 1: If opening bracket → push into stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            
            // Case 2: If closing bracket
            else {

                // If stack is empty → no matching opening bracket
                if (stack.isEmpty()) return false;

                // Check if top of stack matches current closing bracket
                if (c == ')' && stack.peek() != '(') return false;
                if (c == ']' && stack.peek() != '[') return false;
                if (c == '}' && stack.peek() != '{') return false;

                // If match → remove opening bracket
                stack.pop();
            }
        }

        // Final check: stack should be empty if all brackets matched
        return stack.isEmpty();
    }
}
