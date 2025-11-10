class Solution1 {
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




class Solution2 {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0 || nums.length==1) return nums.length; 
        Set<Integer> st = new HashSet<>();
        for(int n : nums)
            st.add(n);
        int count=1, ans=1;
        
        for(int i=0;i<nums.length;i++)
        {
            count=1;
            int n = nums[i]-1;
            while(st.contains(n))
            {
                count++;
                ans=Math.max(ans, count);
                n=n-1;
            }
        }
        return ans;
    }
}


class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0 || nums.length==1) return nums.length; 
        Set<Integer> st = new HashSet<>();
        for(int n : nums)
            st.add(n);
        int count=1, ans=1;
        
        for(int i=0;i<nums.length;i++)
        {
            count=0;
            int n = nums[i];
            if(st.contains(n-1)) continue;
            while(st.contains(n))
            {
                count++;
                st.remove(n);
                n=n+1;
            }
            ans=Math.max(ans, count);
        }
        return ans;
    }
}