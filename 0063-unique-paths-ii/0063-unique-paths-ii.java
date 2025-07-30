class Solution {
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