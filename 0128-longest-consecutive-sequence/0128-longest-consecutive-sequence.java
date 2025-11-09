class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0 || nums.length==1) return nums.length; 
        Arrays.sort(nums);
        int count=1, ans=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1]) continue;
            if(nums[i]==nums[i-1]+1)
                count+=1;

            else count=1;

            ans = Math.max(ans, count);
        }
        return ans;
    }
}