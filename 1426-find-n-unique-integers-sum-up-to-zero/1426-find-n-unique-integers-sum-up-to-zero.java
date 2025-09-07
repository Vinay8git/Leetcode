class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int k=0, num=-1, len=n/2;

        for(int i=1;i<=len;i++)
        {
            res[k++]=num;
            res[k++]=num*(-1);
            num--;
        }
        if(n%2!=0)
        {
            res[k]=0;
        }
        return res;
    }
}