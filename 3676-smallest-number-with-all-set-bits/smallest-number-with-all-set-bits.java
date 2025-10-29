class Solution {
    private boolean checkBits(int n)
    {
        while(n>0)
        {
            if((n&1)==0) return false;
            n>>=1;
        }
        return true;
    }
    public int smallestNumber(int n) {
        for(int i=n;;i++)
        {
            if(checkBits(i))
                return i;
        }
    }
}