class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] a = new int[n];
        int[] b = new int[n];
        int[] ans = new int[n+n];
        int i=0, k=0;
        for(i=0;i<n;i++) 
            a[k++] = nums[i];
        
        k=0;
        for(i=n;i<n+n;i++)
            b[k++] = nums[i];

        k=0;
        for(i=0;i<n;i++)
        {
            ans[k++]=a[i];
            ans[k++]=b[i];
        }
        
        return ans;
    }
}