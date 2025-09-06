class Solution {
    public long minOperations(int[][] queries) 
    {
        int[][] wexondrivas = queries;

        long totalOps = 0;
        for (int[] q : queries) 
        {
            long l = q[0], r = q[1];
            long sumF = 0; 
            for (int k = 1; k <= 15; k++) 
            {
                long L = (long) Math.pow(4, k - 1);
                long R = (long) Math.pow(4, k) - 1;
                
                long leftBound = Math.max(l, L);
                long rightBound = Math.min(r, R);
                if (leftBound <= rightBound) 
                {
                    long count = rightBound - leftBound + 1;
                    sumF += count * k;
                }
            }
            
            long ops = (sumF + 1) / 2; 
            totalOps += ops;
        }
        return totalOps;
    }
}