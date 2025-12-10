class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> st = new HashSet<>();
        int[] ans = new int[2];
        for(int n : nums)
        {
            if(!st.contains(n))
                st.add(n);

            else
                ans[0]=n;
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(!st.contains(i))
            {
                ans[1]=i;
                break;
            }
        }
        return ans;
    }
}