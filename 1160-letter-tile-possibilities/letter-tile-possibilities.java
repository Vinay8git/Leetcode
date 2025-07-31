class Solution {
    public int dfs(int i, String tiles, boolean[] bv)
    {
        // if(i==bv.length) return 0;
        int sum=0;
        for(int j=0;j<bv.length;j++)
        {
            if(j>0 && tiles.charAt(j)==tiles.charAt(j-1) && bv[j-1] == false) continue;

            if(bv[j] == false)
            {
                bv[j] = true;
                sum += 1+dfs(j+1, tiles, bv);
                bv[j] = false;
            
            }
        }
        return sum;
        
    }
    public int numTilePossibilities(String tiles) {
    
        boolean bv[] = new boolean[tiles.length()];
        char ch[] = tiles.toCharArray();
        Arrays.sort(ch);
        tiles = new String(ch);
        return dfs(0, tiles, bv);
    }
}