class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
       
       for (char c : s.toCharArray()) {
        if (c == '(' || c == '{' || c == '[') {
        stack.push(c);
    } else {
        // 1. check if stack is empty → return false
        if (stack.isEmpty()) return false;
        // 2. get top element
        
        // 3. check if matching
        if (c == ')' && stack.peek() != '(') return false;
        if (c == ']' && stack.peek() != '[') return false;
        if (c == '}' && stack.peek() != '{') return false;
        // 4. if not → return false
        // 5. if yes → pop
         stack.pop();
        }
       }
        return stack.isEmpty();
       }
    }


