// class Solution {

//     private int countPaths(int i, int j, int m, int n, int[][]og)
//     {
//         if(i>=m || j>=n) return 0;
//         if(og[i][j] == 1) return 0;

//         if(i==m-1 && j==n-1) return 1;

//         return countPaths(i, j+1, m, n, og) + countPaths(i+1, j, m, n, og);
//     }

//     public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//         return countPaths(0, 0, obstacleGrid.length, obstacleGrid[0].length, obstacleGrid);
//     }
// }


//Top-Down DP : Memoization 
//TC : O(M*N)
//SC : O(M*N)
// class Solution 
// {
//     Map<String , Integer> memo;
//     private int countPaths(int i, int j, int m, int n, int[][]og)
//     {
//         if(i>=m || j>=n) return 0;

//         String key = i+""+j;
//         if(memo.containsKey(key))
//             return memo.get(key);

//         if(og[i][j] == 1)
//         {
//             memo.put(key, 0);
//             return memo.get(key);
//         }

//         memo.put(key, countPaths(i, j+1, m, n, og) + countPaths(i+1, j, m, n, og));
//         return memo.get(key);
//     }

//     public int uniquePathsWithObstacles(int[][] obstacleGrid) 
//     {
//         memo = new HashMap<>();
//         int m = obstacleGrid.length, n = obstacleGrid[0].length;

//         if(obstacleGrid[m-1][n-1] == 1) return 0;

//         memo.put((m-1)+""+(n-1), 1);
//         return countPaths(0, 0, m, n, obstacleGrid);
//     }
// }




//Bottom-UP DP 
//TC : O(n*m)
//SC : O(n*m)
class Solution 
{
    public int uniquePathsWithObstacles(int[][] obstacleGrid) 
    {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;

        if(obstacleGrid[m-1][n-1] == 1 || obstacleGrid[0][0] == 1) return 0;
        
        int[][] dp = new int[m+1][n+1];

        //Base Case : Always Reachable from Itself;

        dp[1][1] = 1;

        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1 && j==1) continue;

                if(obstacleGrid[i-1][j-1] == 1) dp[i][j]=0;

                else
                {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[m][n];
    }
}