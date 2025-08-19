class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        int sub=0;
        for(int num : nums)
        {
            if(num==0) sub++;
            else sub=0;

            ans+=sub;
        }
        return ans;
    }
}