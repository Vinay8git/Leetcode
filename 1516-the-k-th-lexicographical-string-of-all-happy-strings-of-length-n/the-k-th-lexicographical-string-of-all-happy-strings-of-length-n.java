class Solution 
{
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

        if(ans.charAt(ans.length()-1) != 'a')
            compose(ans+"a", n-1, k);  

        if(ans.charAt(ans.length()-1) != 'b')
            compose(ans+"b", n-1, k);

        if(ans.charAt(ans.length()-1) != 'c')
            compose(ans+"c", n-1, k);

        return;


    }
    public String getHappyString(int n, int k) 
    {

        int ser=3;
        ser*= Math.pow(2, n-1);

        if(k <= (ser/3))
            compose("a", n-1, k);

        else if(k>(ser/3) && k <= 2*(ser/3))
        {
            k = k - (ser/3);

            compose("b", n-1, k);
        }

        else
        {
            k = k - 2*(ser/3);

            compose("c", n-1, k);
        }

        
        return res==null? "" : res;
    }
}