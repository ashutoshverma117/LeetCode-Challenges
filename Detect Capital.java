Question:
Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

    1.All letters in this word are capitals, like "USA".
    2.All letters in this word are not capitals, like "leetcode".
    3.Only the first letter in this word is capital, like "Google".

Otherwise, we define that this word doesn't use capitals in a right way. 

Solution:
class Solution {
    public boolean detectCapitalUse(String word) {
        int l=word.length();
        int s=0,c=0;
        for(int i=0;i<l;i++)
        {
        int a=(int)(word.charAt(i));
        if(i==0)
        {
        s++;
        if(a>=65 && a<=90)
        c++;
        }
        else
        {
        if(a>=65 && a<=90)
            c++;
        else if(a>=97 && a<=122)
            s++;
        
        
        }
        
        
        }
        if(s==l || c==l)
            return true;
            else
                return false;
        
    }
}
