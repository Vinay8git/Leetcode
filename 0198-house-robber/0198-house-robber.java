// class Solution {

//     public int dfs(int[] nums, int i) {
//         if (i >= nums.length) return 0;
//         int rob = nums[i] + dfs(nums, i + 2);
//         int skip = dfs(nums, i + 1);
//         return Math.max(rob, skip);
//     }

//     public int rob(int[] nums) {
//         return dfs(nums, 0);
//     }
// }


class Solution 
{
    Map<Integer, Integer> hm = new HashMap<>();
    public int dfs(int[] nums, int i) 
    {
        if(hm.containsKey(i)) 
            return hm.get(i);

        if (i >= nums.length) 
            return 0;

        int rob = nums[i] + dfs(nums, i + 2);
        int skip = dfs(nums, i + 1);

        hm.put(i, Math.max(rob, skip));

        return hm.get(i);
    }

    public int rob(int[] nums) {
        return dfs(nums, 0);
    }
}
