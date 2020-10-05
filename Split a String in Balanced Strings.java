Ques:
Balanced strings are those who have equal quantity of 'L' and 'R' characters.

Given a balanced string s split it in the maximum amount of balanced strings.

Return the maximum amount of splitted balanced strings.

 

Example 1:

Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
Example 2:

Input: s = "RLLLLRRRLR"
Output: 3
Explanation: s can be split into "RL", "LLLRRR", "LR", each substring contains same number of 'L' and 'R'.
Example 3:

Input: s = "LLLLRRRR"
Output: 1
Explanation: s can be split into "LLLLRRRR".
Example 4:

Input: s = "RLRRRLLRLL"
Output: 2
Explanation: s can be split into "RL", "RRRLLRLL", since each substring contains an equal number of 'L' and 'R'


Soln:
class Solution {
   public int balancedStringSplit(String s) {
        Stack<Character> stack = new Stack();
        int res = 0;
        //going over string chars
        for (char ch : s.toCharArray()) {
            //check if char doesn't balance the previous one, or the stack is empty
            if (stack.isEmpty() || stack.peek() == ch)
                stack.push(ch);
            //if chars are balanced - remove the pair
            else
                stack.pop();
            //if stack is empty - all pairs are balanced and we have a balanced substring
            if (stack.isEmpty()) 
                res++;
        }
        return res;
    }
}
