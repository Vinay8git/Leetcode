class Solution {
    Map<String, Integer> hm;
    private int dfs(int[] n, int[] m, int i, int l, int r)
    {
        String key = i+""+l+""+r;
        
        if(hm.containsKey(key))
            return hm.get(key);

        if(i==m.length)
            return 0;

        int start = (m[i]*n[l]) + dfs(n, m, i+1, l+1, r);
        int end = (m[i]*n[r]) + dfs(n, m, i+1, l, r-1);

        hm.put(key, Math.max(start, end));
        return hm.get(key);


    }
    public int maximumScore(int[] nums, int[] multipliers) {
        hm = new HashMap<>();
        return dfs(nums, multipliers, 0, 0, nums.length-1);
    }
}