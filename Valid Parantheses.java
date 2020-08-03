Question:
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.

Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true

Example 2:

Input: "()[]{}"
Output: true

Example 3:

Input: "(]"
Output: false

Example 4:

Input: "([)]"
Output: false

Example 5:

Input: "{[]}"
Output: true


Solution:
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[')        // if the opening brackets come then we simply push
            {
                stack.push(c);
            }
            else if(c == ')' && stack.empty() == false)    // if closing brackets come, we check for the stack is empty and opening brackets is present on the top or not
            {
                if((char)stack.peek() == '(')
                    stack.pop();
                else
                    return false;
            }
            else if(c == '}' && stack.empty() == false)
            {
                if((char)stack.peek() == '{')
                    stack.pop();
                else
                    return false;
            }
            else if(c == ']' && stack.empty() == false)
            {
                if((char)stack.peek() == '[')
                    stack.pop();
                else
                    return false;
            }
            else
            {
                return false;
            }
        }
        if(stack.empty() == true)     // if stack is empty and the program has reached this line for execution, then checking the stack is empty or not
            return true;
        
        return false;
    }
}
