Ques:
Given an integer n. Each number from 1 to n is grouped according to the sum of its digits. 

Return how many groups have the largest size.

 

Example 1:

Input: n = 13
Output: 4
Explanation: There are 9 groups in total, they are grouped according sum of its digits of numbers from 1 to 13:
[1,10], [2,11], [3,12], [4,13], [5], [6], [7], [8], [9]. There are 4 groups with largest size.
Example 2:

Input: n = 2
Output: 2
Explanation: There are 2 groups [1], [2] of size 1.
Example 3:

Input: n = 15
Output: 6
Example 4:

Input: n = 24
Output: 5


Soln:
class Solution {
    public int countLargestGroup(int n) {
        int maxGroupSize = 0;
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
    
        for (int i = 1; i <= n; i++) {
            int val = i;
            if (i > 9) {
               
                val = sumOfDigits(i);
            }
            int totalVals = map.getOrDefault(val, 0) + 1;
            
            maxGroupSize = Math.max(maxGroupSize, totalVals);
            
            
            map.put(val, totalVals);
        }
        
        for(Integer cnt:map.values()) {
         
            if(cnt == maxGroupSize) {
                result++;
            }
        }
        
        return result;
    }
    
    private int sumOfDigits(int num) {
        int sum = 0;
        while(num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}
