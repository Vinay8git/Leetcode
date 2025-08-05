class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count=0;
        for(int i=0;i<fruits.length;i++)
        {
            for(int j=0;j<baskets.length;j++)
            {
                if(baskets[j] == -1) continue;
                if(baskets[j] >= fruits[i])
                {
                    baskets[j] = -1;
                    break;
                }
            }
        }

        for(int n : baskets)
            if(n!=-1) count++;

        return count;
    }
}