class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length, e=0, count=0, ans=0;
        while(e<n)
        {
            if(nums[e]==1) count++;
            else count=0;
            ans = Math.max(ans, count);
            e++;
        }
        return ans;
    }
}