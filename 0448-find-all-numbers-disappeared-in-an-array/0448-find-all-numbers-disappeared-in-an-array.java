class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> st = new HashSet<>();
        List<Integer> al = new ArrayList<>();
        for(int n : nums) st.add(n);

        for(int i=1;i<=nums.length;i++)
        {
            if(!st.contains(i)) al.add(i);
        }
        return al;
    }
}