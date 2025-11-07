class Solution1 {
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




class Solution {
    private int findIdx(int[] nums, int target)
    {
        int low=0, high=nums.length-1, ans=-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(nums[mid]<=target)
            {
                low=mid+1;
                ans=mid;
            }
            else
                high=mid-1;
        }
        return ans==-1?0:ans+1;
    }
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] res = new int[queries.length];
        int count=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
            nums[i]=nums[i]+nums[i-1];
        
        for(int k=0;k<queries.length;k++)
        {
            res[k]=findIdx(nums, queries[k]);
        }
        return res;
    }
}