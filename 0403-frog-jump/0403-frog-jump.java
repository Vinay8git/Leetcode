class Solution1 {
    private boolean dfs(Set<Integer> st, int stone, int k, int last)
    {
        if(stone == last) return true;
        if(k<=0) return false;
        if(st.contains(stone))
        {
            return dfs(st, stone+(k-1), k-1, last) || dfs(st, stone+(k), k, last) || dfs(st, stone+(k+1), k+1, last);
        }
        else return false;
    }
    public boolean canCross(int[] stones) {
        Set<Integer> st = new HashSet<>();
        for(int n : stones)
            st.add(n);

        return dfs(st, 1, 1, stones[stones.length-1]);
    }
}



class Solution {
    Map<String, Boolean> hm;
    private boolean dfs(Set<Integer> st, int stone, int k, int last)
    {
        String key = stone+""+k;
        if(hm.containsKey(key))
            return hm.get(key);
        if(stone == last){
            hm.put(key, true);
            return hm.get(key);
        }
        if(k<=0)
        {
            hm.put(key, false);
            return hm.get(key);
        }

        if(st.contains(stone))
        {
            hm.put(key, dfs(st, stone+(k-1), k-1, last) || dfs(st, stone+(k), k, last) || dfs(st, stone+(k+1), k+1, last));
            return hm.get(key);
        }
        else
        {
            hm.put(key, false);
            return hm.get(key);
        }
    }
    public boolean canCross(int[] stones) {
        Set<Integer> st = new HashSet<>();
        for(int n : stones)
            st.add(n);

        hm = new HashMap<>();
    
        return dfs(st, 1, 1, stones[stones.length-1]);
    }
}