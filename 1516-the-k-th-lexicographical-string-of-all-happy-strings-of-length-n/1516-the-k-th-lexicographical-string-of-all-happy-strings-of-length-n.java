class Solution1 {
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



class Solution2 
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

        
        return res == null ? "" : res;
    }
}



class Solution 
{
    // int count = 0;
    // String res;
    // private void compose(String ans, int n, int k)
    // {
    //     if(n==0)
    //     {
    //         count++;
    //         if(count==k)
    //             res=ans;

    //         return;
    //     }
    //     if(count>=k) return;

    //     if(ans.charAt(ans.length()-1) != 'a')
    //         compose(ans+"a", n-1, k);  

    //     if(ans.charAt(ans.length()-1) != 'b')
    //         compose(ans+"b", n-1, k);

    //     if(ans.charAt(ans.length()-1) != 'c')
    //         compose(ans+"c", n-1, k);

    //     return;


    // }
    public String getHappyString(int n, int k) 
    {
        int level = 3*(int)Math.pow(2, n-1);
        if(k>level) return "";

        Queue<String> q = new LinkedList<>();

        if(n==1)
        {
            if(k==1) return "a";
            if(k==2) return "b";
            if(k==3) return "c";
            // if(k>3) return "";
        }
        q.offer("a");
        q.offer("b");
        q.offer("c");
        // n-=1;


        while(!q.isEmpty())
        {
            String parent = q.poll();
            for(char c='a'; c<='c'; c++)
            {
                if(parent.charAt(parent.length()-1) == c)
                    continue;

                if(parent.length()+1 == n)
                    k--;

                String res = parent+c;
                if(k==0) return res;

                q.offer(res);
            }
        }
        return "";

    }
}