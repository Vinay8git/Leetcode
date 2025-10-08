class Solution1 {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int m=spells.length, n=potions.length, count=0;
        int[] ans = new int[m];
        for(int i=0;i<m;i++)
        {
            count=0;
            for(int j=0;j<n;j++)
            {
                if((long)((long)spells[i]*(long)potions[j]) >= success)
                    count++;
            }
            ans[i]=count;
            
        }
        return ans;
    }
}




class Solution2 {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int m=spells.length, n=potions.length, count=0;
        int[] ans = new int[m];

        Arrays.sort(potions);

        for(int i=0;i<m;i++)
        {
            count=0;
            for(int j=0;j<n;j++)
            {
                if((long)((long)spells[i]*(long)potions[j]) >= success)
                {
                    count = n-j;
                    break;
                }
            }
            ans[i]=count;
            
        }
        return ans;
    }
}





class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int m=spells.length, n=potions.length, count=0;
        int[] ans = new int[m];
        int l, r, mid;
        Arrays.sort(potions);

        for(int i=0;i<m;i++)
        {
            count=0;
            l=0;
            r=n-1;
            while(l<=r)
            {
                mid = l+((r-l)/2);
                if((long)((long)potions[mid]*(long)spells[i]) >= success )
                {
                    r=mid-1;
                }
                else
                    l=mid+1;
            }
            ans[i] = n-r-1;
            
        }
        return ans;
    }
}