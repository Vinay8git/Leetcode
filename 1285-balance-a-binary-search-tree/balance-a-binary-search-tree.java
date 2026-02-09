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
class Solution {
    List<Integer> al=new ArrayList<>();
    TreeNode r;
    public void inorder(TreeNode root)
    {
        if(root==null)
            return;
        inorder(root.left);
        al.add(root.val);
        inorder(root.right);
    }
    public TreeNode constructBST(List<Integer>al, int l, int h)
    {
        if(l>h) return null;
        int mid=(l+h)/2;
        TreeNode n=new TreeNode(al.get(mid));
        // root.left=new TreeNode();
        // root.right=new TreeNode();
        n.left=constructBST(al, l, mid-1);
        n.right=constructBST(al, mid+1, h);
        return n;
    }
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        // System.out.println(al);
        // TreeNode newNode=new TreeNode();
        return constructBST(al, 0, al.size()-1);
        // return r;
    }
}