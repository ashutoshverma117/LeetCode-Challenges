Question:
In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.

Return the element repeated N times.

 

Example 1:

Input: [1,2,3,3]
Output: 3
Example 2:

Input: [2,1,2,5,3,2]
Output: 2
Example 3:

Input: [5,1,5,2,5,3,5,4]
Output: 5

Solution:
class Solution {
public int repeatedNTimes(int[] A) {
HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
for(int i:A){
if(hm.containsKey(i))
return i;
else
hm.put(i,1);
}
return -1;
}
}
