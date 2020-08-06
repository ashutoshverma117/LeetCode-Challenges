Question:
Given a non-empty array of digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.

Solution:
class Solution {
public int[] plusOne(int[] digits) {
  
 ArrayList<Integer> list=new ArrayList<>();   
 int carry=1;
 for(int i=digits.length-1;i>=0;i--)
 {
    int v=digits[i]+carry;   
    list.add(v%10); 
    carry=v/10; 
 }
 
 if(carry!=0)
 list.add(carry);
    
 int []ans=new int[list.size()];
    int c=0;
 for(int i=list.size()-1;i>=0;i--)
 {ans[c]=list.get(i);
  c++;}  
 return ans;   
}
