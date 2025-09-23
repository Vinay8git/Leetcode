// class Solution {
//     public int dfs(int[][] matrix, int r, int c, int n)
//     {
//         if(r==n)
//             return 0;
//         if(c<0 || c>=n)
//             return Integer.MAX_VALUE;
//         int left=dfs(matrix, r+1, c-1, n);
//         int mid=dfs(matrix, r+1, c, n);
//         int right=dfs(matrix, r+1, c+1, n);
//         return matrix[r][c]+Math.min(left, Math.min(mid, right));
//     }
//     public int minFallingPathSum(int[][] matrix) {
//         int n=matrix.length, min=Integer.MAX_VALUE;
//         for(int i=0;i<n;i++)
//         {
//             int res=dfs(matrix, 0, i, n);
//             min=Math.min(min, res);
//         }
//         return min;
//     }
// }

class Solution {
    int[][] dp;
    public int dfs(int[][] matrix, int r, int c, int n)
    {
        if(c<0 || c>=n)
            return Integer.MAX_VALUE;
        if(r==n-1)
            return matrix[r][c];

        if(dp[r][c] != Integer.MIN_VALUE) return dp[r][c];

        int left=dfs(matrix, r+1, c-1, n);
        int mid=dfs(matrix, r+1, c, n);
        int right=dfs(matrix, r+1, c+1, n);

        dp[r][c]=matrix[r][c]+Math.min(left, Math.min(mid, right));
        return dp[r][c];
    }
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length, min=Integer.MAX_VALUE;
        dp=new int[n][n];
        for(int[] ar : dp)
        {
            Arrays.fill(ar, Integer.MIN_VALUE);
        }
        for(int i=0;i<n;i++)
        {
            int res=dfs(matrix, 0, i, n);
            min=Math.min(min, res);
        }
        return min;
    }
}





// class Solution {
//     Map<String, Integer> memo;
//     public int dfs(int[][] matrix, int r, int c, int n)
//     {
//         String key = r+""+c;
//         if(memo.containsKey(key))
//             return memo.get(key);

//         if(r==n)
//         {
//             memo.put(key, 0);
//                 return memo.get(key);
//         }
//         if(c<0 || c>=n)
//         {
//             // memo.put(key, Integer.MAX_VALUE);
//             return Integer.MAX_VALUE;
//         }

//         int left=dfs(matrix, r+1, c-1, n);
//         int mid=dfs(matrix, r+1, c, n);
//         int right=dfs(matrix, r+1, c+1, n);

//         memo.put(key, (matrix[r][c]+Math.min(left, Math.min(mid, right))));
//         return memo.get(key);
//     }
//     public int minFallingPathSum(int[][] matrix) {
//         int n=matrix.length, min=Integer.MAX_VALUE;
//         memo = new HashMap<>();

//         for(int i=0;i<n;i++)
//         {
//             int res=dfs(matrix, 0, i, n);
//             min=Math.min(min, res);
//         }
//         return min;
//     }
// }