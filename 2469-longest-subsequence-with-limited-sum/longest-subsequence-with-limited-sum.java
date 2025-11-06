class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] res = new int[queries.length];
        int count=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
            nums[i]=nums[i]+nums[i-1];
        
        for(int k=0;k<queries.length;k++)
        {
            count=0;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]<=queries[k])
                    count++;
                else break;
            }
            res[k]=count;
        }
        return res;
    }
}