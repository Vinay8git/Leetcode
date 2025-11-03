// class Solution 
// {
//     public int climbStairs(int n) 
//     {
//         int a=2,b=3,i,nxt=0; 
//         if(n==1)
//             return 1;
//         else if(n==2)
//             return 2;
//         else if(n==3)
//             return 3;
//         else
//         {
//             for(i=4;i<=n;i++)
//             {
//                 nxt=a+b;
//                 a=b;
//                 b=nxt;
//             }
//             return nxt;
//         }
//     }
// }

//Recursive Approach
//f1(n) = f1(n-1)+f1(n-2);
//f1(1) = 1

// class Solution 
// {
//     public int f1(int n)
//     {
//         if(n==1) return 1;
//         if(n==2) return 2;
//         return f1(n-1)+f1(n-2);
//     }
//     public int climbStairs(int n) 
//     {
//         return f1(n);
//     }
// }


//Memoization- Top-Down DP
//Time - O(n)   
//Space - O(n)   
//Stack Space - O(n)


// class Solution 
// {
//     HashMap<Integer, Integer>hm=new HashMap<>();
//     public int f1(int n)
//     {
//         if(hm.containsKey(n)) return hm.get(n);
//         else
//         {
//             hm.put(n, f1(n-1)+f1(n-2));
//         }
//         return hm.get(n);
//     }
//     public int climbStairs(int n) 
//     {
//         // int var=1;
//         hm.put(1,1);
//         hm.put(2,2);
//         return f1(n);
//     }
// }



//Bottom-Up DP - Tabulation
//Time - O(n);
//Space - O(n) = n+1
//Stack Space - O(1)

// class Solution 
// {
//     HashMap<Integer, Integer>hm=new HashMap<>();
//     public int f1(int n)
//     {
//         if(hm.containsKey(n)) return hm.get(n);
//         else
//         {
//             for(int i=2;i<=n;i++)
//                 hm.put(i, hm.get(i-1)+hm.get(i-2));
//         }
//         return hm.get(n);
//     }
//     public int climbStairs(int n) 
//     {
//         hm.put(1,1);
//         hm.put(0,1);
//         return f1(n);
//     }
// }


class Solution 
{
    public int climbStairs(int n) 
    {
        int[] dp = new int[n+1];

        dp[0]=1;
        dp[1]=2;
        for(int i=2;i<n;i++)
            dp[i]=dp[i-1]+dp[i-2];

        return dp[n-1];
    }
}