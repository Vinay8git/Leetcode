class Solution {

    List<String> al = new ArrayList<>();

    public void dfs(TreeNode node, String val)
    {
        if(node == null) return;

        val = val + node.val;

        // Correct leaf condition
        if(node.left == null && node.right == null)
        {
            al.add(val);
            return;
        }

        dfs(node.left, val);
        dfs(node.right, val);
    }

    public int convert2Base10(String val)
    {
        int n = val.length() - 1, sum = 0;

        for(int i = 0; i <= n; i++)
        {
            int digit = val.charAt(i) - '0';

            // Correct binary conversion
            sum += digit * (int)Math.pow(2, n - i);
        }

        return sum;
    }

    public int calculateSum()
    {
        int sum = 0;

        for(String val : al)
        {
            sum += convert2Base10(val);
        }

        return sum;
    }

    public int sumRootToLeaf(TreeNode root) {

        dfs(root, "");
        return calculateSum();
    }
}