class Solution {
    public int countSetBits(int n)
    {
        int count=0;
        while(n>0)
        {
            if((n&1) == 1) count++;
            n>>=1;
        }
        return count;
    }
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int n=left; n<=right; n++)
        {
            int sb = countSetBits(n);
            if(sb==2 || sb==3 || sb==5 || sb==7 || sb==11 || sb==13 || sb==17 || sb==19)
                count++;
        }
        return count;
    }
}