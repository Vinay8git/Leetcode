class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> st = new LinkedHashSet<>() ;
        for(int n : nums)
            st.add(n);
        
        int i=0;
        for(int n : st)
        {
            nums[i++]=n;
        }
        return i;  
    }
}