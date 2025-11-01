class Solution {
    Map<Integer, Boolean> hm = new HashMap<>();
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if(desiredTotal <= 0) return true;

        int sum = (maxChoosableInteger * (maxChoosableInteger + 1))/2;
        if(sum < desiredTotal) return false;

        if(sum==desiredTotal)
            return (maxChoosableInteger%2)==1;

        return canWin(0, 0, maxChoosableInteger, desiredTotal);

    }
    private boolean canWin(int used, int curr, int max, int dt)
    {
        if(hm.containsKey(used)) return hm.get(used);
        int i=1;
        do //for(int i=1;i<=max;i++)
        {
            int curBit = 1 << i;
            if((used & curBit) == 0)
            {
                if((i+curr >= dt) || !canWin(used|curBit, curr+i, max, dt))
                {
                    hm.put(used, true);
                    return true;
                }
            }
            i++;
        }while(i<=max);
        hm.put(used, false);
        return false;
    }
}