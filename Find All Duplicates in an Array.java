Question:
Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements that appear twice in this array.

Could you do it without extra space and in O(n) runtime?

Example:
Input:
[4,3,2,7,8,2,3,1]

Output:
[2,3]



Solution:
import java.util.*;
class Solution 
{
    public List<Integer> findDuplicates(int[] nums)
    {ArrayList<Integer> a= new ArrayList<>();
    Arrays.sort(nums);
    for(int i=0;i<nums.length-1;i++)
    {
        if(nums[i]==nums[i+1])
           a.add(nums[i]);
            
    }
     
     return a;
    
    }
}
