class Solution {
    int count = 0;
    String res;
    private void compose(String ans, int n, int k)
    {
        if(n==0)
        {
            count++;
            if(count==k)
                res=ans;

            return;
        }
        if(count>=k) return;

        if(ans.isEmpty() || ans.charAt(ans.length()-1) != 'a')
            compose(ans+"a", n-1, k);  

        if(ans.isEmpty() || ans.charAt(ans.length()-1) != 'b')
            compose(ans+"b", n-1, k);

        if(ans.isEmpty() || ans.charAt(ans.length()-1) != 'c')
            compose(ans+"c", n-1, k);

        return;


    }
    public String getHappyString(int n, int k) 
    {

        compose("", n, k);
        return res==null? "" : res;
    }
}