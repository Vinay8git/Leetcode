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
class Solution1 {
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

class Solution {

    public TreeNode balanceBST(TreeNode root) {
        if (root == null) return null;

        // Step 1: Create the backbone (vine)
        // Temporary dummy node
        TreeNode vineHead = new TreeNode(0);
        vineHead.right = root;
        TreeNode current = vineHead;
        while (current.right != null) {
            if (current.right.left != null) {
                rightRotate(current, current.right);
            } else {
                current = current.right;
            }
        }

        // Step 2: Count the nodes
        int nodeCount = 0;
        current = vineHead.right;
        while (current != null) {
            ++nodeCount;
            current = current.right;
        }

        // Step 3: Create a balanced BST
        int m =
            (int) Math.pow(
                2,
                Math.floor(Math.log(nodeCount + 1) / Math.log(2))
            ) -
            1;
        makeRotations(vineHead, nodeCount - m);
        while (m > 1) {
            m /= 2;
            makeRotations(vineHead, m);
        }

        TreeNode balancedRoot = vineHead.right;
        return balancedRoot;
    }

    // Function to perform a right rotation
    private void rightRotate(TreeNode parent, TreeNode node) {
        TreeNode tmp = node.left;
        node.left = tmp.right;
        tmp.right = node;
        parent.right = tmp;
    }

    // Function to perform a left rotation
    private void leftRotate(TreeNode parent, TreeNode node) {
        TreeNode tmp = node.right;
        node.right = tmp.left;
        tmp.left = node;
        parent.right = tmp;
    }

    // Function to perform a series of left rotations to balance the vine
    private void makeRotations(TreeNode vineHead, int count) {
        TreeNode current = vineHead;
        for (int i = 0; i < count; ++i) {
            TreeNode tmp = current.right;
            leftRotate(current, tmp);
            current = current.right;
        }
    }
}