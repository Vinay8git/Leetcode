class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        int n = s.length();
        Set<String> dict = new HashSet<>(Arrays.asList(dictionary));
        int[] dp = new int[n+1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[n] = 0;

        for(int i=n-1;i>=0;i--)
        {
            //skip
            dp[i] = 1+dp[i+1];
            for(int j=i;j<n;j++)
            {
                String st = s.substring(i, j+1);
                if(dict.contains(st))
                    dp[i] = Math.min(dp[i], dp[j+1]);
            }
        }
        //Answer
        return dp[0];
    }
}