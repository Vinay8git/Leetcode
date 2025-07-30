class Solution1 {
    Map<String, Integer> hm;
    private int search(int i, int j, int m, int n, int[][] og)
    {   
        String key = i+""+j;
        if(hm.containsKey(key))
            return hm.get(key);

        if(i>=m || j>=n)
        {
            hm.put(key, 0);
            return hm.get(key);
        }
        if(og[i][j] == 1)
        {
            hm.put(key, 0);
            return hm.get(key);
        }

        hm.put(key, search(i+1, j, m, n, og) + search(i, j+1, m, n, og));
        return hm.get(key);
    }
    public int uniquePathsWithObstacles(int[][] og) 
    {
        hm = new HashMap<>();
        int m = og.length;
        int n = og[0].length;
        if(og[m-1][n-1] == 1) return 0;

        //Base Case
        hm.put((m-1)+""+(n-1), 1);

        return search(0, 0, m, n, og);
    }
}


class Solution2 {
    public int uniquePathsWithObstacles(int[][] og) 
    {
        int m = og.length;
        int n = og[0].length;

        //Special Case
        if(og[m-1][n-1] == 1) return 0;

        int[][] dp = new int[m+1][n+1];

        //Base Case
        dp[m-1][n-1] = 1;

        for(int i=m-1; i>=0; i--)
        {
            for(int j=n-1; j>=0; j--)
            {
                if(i==m-1 && j==n-1)
                    continue;

                if(og[i][j]==1)
                    dp[i][j]=0;

                else dp[i][j] = dp[i+1][j]+dp[i][j+1];
            }
        }
        return dp[0][0];
    }
}

class Solution {
    public int uniquePathsWithObstacles(int[][] og) 
    {
        int m = og.length;
        int n = og[0].length;

        //Special Case
        if(og[m-1][n-1] == 1) return 0;
        if(og[0][0] == 1) return 0;

        int[][] dp = new int[m+1][n+1];

        //Base Case
        dp[1][1] = 1;

        for(int i=1; i<=m; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(i==1 && j==1)
                    continue;

                if(og[i-1][j-1]==1)
                    dp[i][j]=0;

                else dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m][n];
    }
}