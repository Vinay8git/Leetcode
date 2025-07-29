class Solution {
    int min=Integer.MAX_VALUE;
    private void dfs(int[] sum, int i, int[] cookies)
    {
        if(i==cookies.length)
        {
            int max = 0;
            for(int n : sum)
            {
                max = Math.max(max, n);
            }
            min = Math.min(min, max);
            return;
        }
        for(int k=0;k<sum.length;k++)
        {
            sum[k]+=cookies[i];
            dfs(sum, i+1, cookies);
            sum[k]-=cookies[i];
        }

    }
    public int distributeCookies(int[] cookies, int k) {
        int[] sum=new int[k];
        dfs(sum, 0,cookies);
        return min;
    }
}