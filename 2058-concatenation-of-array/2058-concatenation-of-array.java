class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length, k=0;
        int ans[] = new int[2*n];

        for(int num : nums)
            ans[k++] = num;

        for(int num : nums)
            ans[k++] = num;

        return ans;
    }
}