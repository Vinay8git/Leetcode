class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int lg = 0;
        int ma = 0;
        for(int[] dm : dimensions)
        {
            int len = dm[0];
            int wd = dm[1];

            int d = len*len + wd*wd;
            int a = len*wd;
            if(d > lg)
            {
                lg=d;
                ma=a;
            }
            else if(lg==d)
            {
                ma=Math.max(ma, a);
            }
        }
        return ma;
    }
}