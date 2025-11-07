class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] frq = new int[100];
        int[] ans=new int[2];

        for(int n : nums)
            frq[n]+=1;
        int k=0;
        for(int i=0;i<frq.length;i++)
        {
            if(frq[i]==2)
                ans[k++]=i;
            if(k==2) return ans;
        }
        return ans;
    }
}