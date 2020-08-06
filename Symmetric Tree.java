Question:
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
 

But the following [1,2,2,null,3,null,3] is not:

    1
   / \
  2   2
   \   \
   3    3
   

Solution:
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root==null || traverse(root.left,root.right);
    }
    private boolean traverse(TreeNode one,TreeNode two){
        if(one==null && two==null)return true;
        if(one==null || two==null)return false;
        if(one.val!=two.val)return false;
        boolean resl=traverse(one.left,two.right);
        if(!resl)return false;
        boolean resr=traverse(one.right,two.left);
        if(!resr)return false;
        return true;
    }
}
