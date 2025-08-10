class Solution {
    private int[] count(int n)
    {
        int[] frq = new int[10];
        while(n>0)
        {
            frq[n%10]++;
            n/=10;
        }
        return frq;
    }
    public boolean reorderedPowerOf2(int n) 
    {
        int[] oc = new int[10];
        oc = count(n);
        for(int i=0;i<30;i++)
        {
            if(Arrays.equals(count((int) Math.pow(2, i)), oc))
                return true;
        }

        return false;
    }
}