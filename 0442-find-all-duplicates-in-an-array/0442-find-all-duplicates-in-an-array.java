class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> al = new ArrayList<>();
        int size = nums.length, val;
        for(int i=0;i<size;i++)
        {
            val = nums[i]>size?nums[i]-size:nums[i];

            if(nums[val-1] > size)
                al.add(val);

            else nums[val-1] = nums[val-1]+size;

        }
        return al;
    }
}