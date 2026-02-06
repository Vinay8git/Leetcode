class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length, ans=n;
        if(n==1) return 0;
        if(n==2)
        {
            if(nums[1]<=k*nums[0]) return 0;
            else return 1;
        }
        int i=0, j=0;
        while(i<n)
        {
            while(j<n && nums[j] <= (long)k*nums[i]) j++;
            ans=Math.min(ans, n-(j-i));
            i++;
        }
        return ans;
    }
}