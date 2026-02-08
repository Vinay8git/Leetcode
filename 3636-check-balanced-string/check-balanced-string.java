class Solution {
    public boolean isBalanced(String num) {
        int i=0, even=0, odd=0;
        for(char c : num.toCharArray())
        {
            if(i%2==0)
                even+=(c-'0');
            else odd+=(c-'0');

            i++;
        }
        return even==odd;
    }
}