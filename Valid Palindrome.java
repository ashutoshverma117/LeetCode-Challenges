Question:
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true

Example 2:

Input: "race a car"
Output: false

Solution:
class Solution {
    public boolean isPalindrome(String s) {if(s==null){
        return true;
    }
 
    s = s.toLowerCase();
 
    int i=0;
    int j=s.length()-1;
 
    while(i<j){
        while(i<j && !((s.charAt(i)>='a' && s.charAt(i)<='z') 
                    || (s.charAt(i)>='0'&&s.charAt(i)<='9'))){
            i++;
        }
 
        while(i<j && !((s.charAt(j)>='a' && s.charAt(j)<='z') 
                    || (s.charAt(j)>='0'&&s.charAt(j)<='9'))){
            j--;
        }
 
        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
 
        i++;
        j--;
    }
 
    return true;
        
    }
}
