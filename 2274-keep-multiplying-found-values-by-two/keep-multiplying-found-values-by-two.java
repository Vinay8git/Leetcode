class Solution {
    private boolean inNums(int[] nums, int org)
    {
        for(int n : nums)
        {
            if(n==org) return true;
        }
        return false;
    }
    public int findFinalValue(int[] nums, int original) {
        while(inNums(nums, original))
        {   
            original*=2;
        }

        return original;
    }
}