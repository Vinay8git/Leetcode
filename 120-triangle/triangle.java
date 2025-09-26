// class Solution {
//     private int dfs(int i, int j, int n, List<List<Integer>> triangle)
//     {
//         if(i>=n) return 0;
//         int m = triangle.get(i).size();
//         if(j>=m) return Integer.MAX_VALUE;

//         int down = triangle.get(i).get(j) + dfs(i+1, j, n, triangle);
//         int rightDown = triangle.get(i).get(j) + dfs(i+1, j+1, n, triangle);

//         return Math.min(down, rightDown);

//     }
//     public int minimumTotal(List<List<Integer>> triangle) {
//         return dfs(0, 0, triangle.size(), triangle);
//     }
// }


class Solution {
    private Map<String, Integer> hm;
    private int dfs(int i, int j, int n, List<List<Integer>> triangle)
    {
        if(i>=n) return 0;
        int m = triangle.get(i).size();
        if(j>=m) return Integer.MAX_VALUE;

        String key = i+":"+j;
        if(hm.containsKey(key))
            return hm.get(key);
            
        
        int down = triangle.get(i).get(j) + dfs(i+1, j, n, triangle);
        int rightDown = triangle.get(i).get(j) + dfs(i+1, j+1, n, triangle);

        hm.put(key, Math.min(down, rightDown));
        return hm.get(key);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        hm = new HashMap<>();
        return dfs(0, 0, triangle.size(), triangle);
    }
}