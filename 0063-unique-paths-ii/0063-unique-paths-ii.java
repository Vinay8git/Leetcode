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
class Solution 
{
    Map<String , Integer> memo;
    private int countPaths(int i, int j, int m, int n, int[][]og)
    {
        if(i>=m || j>=n) return 0;

        String key = i+""+j;
        if(memo.containsKey(key))
            return memo.get(key);

        if(og[i][j] == 1)
        {
            memo.put(key, 0);
            return memo.get(key);
        }

        memo.put(key, countPaths(i, j+1, m, n, og) + countPaths(i+1, j, m, n, og));
        return memo.get(key);
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) 
    {
        memo = new HashMap<>();
        int m = obstacleGrid.length, n = obstacleGrid[0].length;

        if(obstacleGrid[m-1][n-1] == 1) return 0;
        
        memo.put((m-1)+""+(n-1), 1);
        return countPaths(0, 0, m, n, obstacleGrid);
    }
}