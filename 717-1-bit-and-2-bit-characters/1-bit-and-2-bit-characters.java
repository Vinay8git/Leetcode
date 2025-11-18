class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length, i;
        for(i=0;i<n-1;i++)
        {
            if(bits[i] == 1)
                i++;
        }

        if(i>=n) return false;
        return true;
    }
}