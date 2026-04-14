class Solution 
{
    public long minimumTotalDistance(List<Integer> robots, int[][] factories)
    {
        Collections.sort(robots);
        Arrays.sort(factories, Comparator.comparingInt(a -> a[0]));

        List<Integer> facPos = new ArrayList<>();
        for (int[] fac : factories) 
        {
            for (int i = 0; i < fac[1]; i++)
                facPos.add(fac[0]);
        }

        int robotCount = robots.size(), factoryCount = facPos.size();
        long[] next = new long[factoryCount + 1];
        long[] current = new long[factoryCount + 1];

        current[factoryCount] = (long) 1e12;

        for (int i = robotCount - 1; i >= 0; i--) 
        {
            for (int j = factoryCount - 1; j >= 0; j--) 
            {
                long assign = Math.abs((long) robots.get(i) - facPos.get(j)) + next[j + 1];
                long skip = current[j + 1];
                current[j] = Math.min(assign, skip);
            }
            System.arraycopy(current, 0, next, 0, factoryCount + 1);
        }
        return current[0];
    }
}