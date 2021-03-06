Question:
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
Solution:
class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0; 
        }
        
        if (nums.length == 1) {
            return nums[0];
        }
        
        int[]  arr = new int[nums.length];
        arr[nums.length-1] = nums[nums.length-1];
        int max = arr[nums.length-1];
        
        for(int i = nums.length-2; i >= 0; i--) {
            arr[i] = (nums[i] + arr[i+1] > nums[i]) ? nums[i] + arr[i+1] : nums[i];
            max = (arr[i] > max) ? arr[i] : max; 
        }
        
        return max;
    }
}
