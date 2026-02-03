class Solution {
    public boolean isTrionic(int[] nums) {
        boolean slope = nums[0]<nums[1] ? true:false;
        if(!slope) return false;
        int count=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(slope && nums[i] > nums[i+1])
            {
                slope=false;
                count++;
            }
            else if(!slope && nums[i] < nums[i+1])
            {
                slope=true;
                count++;
            }
            else if(nums[i]==nums[i+1])
                return false;
        }
        return count==3;
    }
}