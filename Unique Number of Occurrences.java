Question:
Given an array of integers arr, write a function that returns true if and only if the number of occurrences of each value in the array is unique.

 

Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false
Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true

Soln:
class Solution {
public boolean uniqueOccurrences(int[] arr) {
int v = 0;
HashMap<Integer,Integer> map = new HashMap<>();
for(int i = 0 ; i<arr.length;++i)
{
if(map.containsKey(arr[i]))
{
v = map.get(arr[i]);
map.put(arr[i],++v);
}
else
map.put(arr[i],1);
}
Set<Integer> set = new HashSet<>();
for(Map.Entry m : map.entrySet())
{
if(set.contains(m.getValue()))
{
return false;
}
else
set.add((Integer)m.getValue());
}

return true;
}
}

