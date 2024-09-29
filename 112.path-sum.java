/*
 * @lc app=leetcode id=112 lang=java
 *
 * [112] Path Sum
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{
    public boolean find(TreeNode root, int target, int sum)
    {
        if(root==null) return false;
        sum+=root.val;
        if(root.left==null && root.right==null)
        return sum==target;
        return find(root.left,target,sum) || find(root.right,target,sum);
        

    }
    public boolean hasPathSum(TreeNode root, int targetSum) 
    {
        if(root==null) return false;
        return find(root, targetSum, 0);
    }
}


