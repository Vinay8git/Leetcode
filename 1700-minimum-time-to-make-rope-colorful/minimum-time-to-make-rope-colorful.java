class Solution {
    public int minCost(String colors, int[] neededTime) 
    {
        int time = 0, n=colors.length();
        int l=0, r=1;

        while(r<n)
        {
            if(colors.charAt(l)==colors.charAt(r))
            {
                if(neededTime[l]<=neededTime[r])
                {
                    time+=neededTime[l];
                    l=r;
                    r++;
                }
                else
                {
                    time+=neededTime[r];
                    r++;
                }

            }
            else
            {
                l=r;
                r++;
            }
        }

        return time;
    }
}