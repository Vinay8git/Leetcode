// class Solution {
//     private int totalTime(int[] piles, int k)
//     {
//         int time=0;
//         for(int i=0;i<piles.length;i++)
//         {
//             time+=(Math.ceil((double)piles[i]/(double)k));
//         }
//         return time;
//     }
//     public int minEatingSpeed(int[] piles, int h) {
//         int max = piles[0];
//         for(int pile:piles)
//             max=Math.max(max, pile);

//         for(int k=1;k<=max;k++)
//         {
//             if(totalTime(piles, k) <= h)
//                 return k;
//         }
//         return -1;
//     }
// }




class Solution {
    private int totalTime(int[] piles, int k)
    {
        int time=0;
        for(int i=0;i<piles.length;i++)
        {
            time+=(Math.ceil((double)piles[i]/(double)k));
        }
        return time;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for(int pile:piles)
            max=Math.max(max, pile);

        int low=1, high=max, mid, ans=0;

        while(low<=high)
        {
            mid=low+((high-low)/2);
            if(totalTime(piles, mid) <= h)
            {
                ans=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return ans;
    }
}