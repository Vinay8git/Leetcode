/*
 * @lc app=leetcode id=1497 lang=java
 *
 * [1497] Check If Array Pairs Are Divisible by k
 */

// @lc code=start
//TLE : Because Of Exhaustive Search
// Even when the values of some pairs are checked, It One of memebers of pair are agian checked.

// class Solution {
//     public boolean canArrange(int[] arr, int k) {
//         int c=0;
//         for(int i=0;i<arr.length-1;i++)
//         {
//             if(arr[i]!=Integer.MIN_VALUE)
//             {
//                 for(int j=i+1;j<arr.length;j++)
//                 {
//                     if(arr[j]!=Integer.MIN_VALUE && ((arr[i]+arr[j])%k==0))
//                     {
//                         System.out.println(arr[i]+":"+arr[j]);
//                         arr[i]=Integer.MIN_VALUE;
//                         arr[j]=Integer.MIN_VALUE;
//                         c++;
//                         break;
//                     }
//                 }
//             }
//         }
//         System.out.println(c);
//         return c==arr.length/2;
//     }
// }

//Using ArrayList

// class Solution {
//     public boolean canArrange(int[] arr, int k) {
//         List<Integer>al=new ArrayList<>();
//         int c=0;
//         for(int n : arr)
//             al.add(n);

//         for(int i=0;i<al.size()-1;i++)
//         {
            
//             for(int j=i+1;j<al.size();j++)
//             {
//                 if((al.get(i)+al.get(j))%k==0)
//                 {
//                     System.out.println(al.get(i)+":"+al.get(j));
//                     al.remove(j);
//                     al.remove(i);
//                     i--;
//                     // c++;
//                     break;
//                 }
//             }
            
//         }
//         System.out.println(al.size());
//         return al.size()==0;
//     }
// }

// class Solution 
// {
//     public boolean canArrange(int[] arr, int k) {
//         Map<Integer, Integer>hm=new HashMap<>();
//         int c=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             arr[i]=arr[i]%k;
//         }
//         for(int n : arr)
//         {
//             if(n>0 && hm.containsKey(k-n))
//             {
//                 hm.put(k-n, hm.getOrDefault(k-n, 0) - 1);
//                 if(hm.get(k-n)==0)
//                     hm.remove(k-n);
//                 c++;
//                 System.out.println(n + " : "+(k-n));
//             }
//             else if(n<0)
//             {
//                 if(hm.containsKey(k-n))
//                 {
//                     hm.put(k-n, hm.getOrDefault(k-n, 0) - 1);
//                     if(hm.get(k-n)==0)
//                         hm.remove(k-n);
//                     c++;
//                     System.out.println(n + " : "+(k-n));
//                 }
//                 else if(hm.containsKey(k+n))
//                 {
//                     hm.put(k+n, hm.getOrDefault(k+n, 0) - 1);
//                     if(hm.get(k+n)==0)
//                         hm.remove(k+n);
//                     c++;
//                     System.out.println(n + " : "+(k+n));
//                 }
//             }
//             else if(n==0 && hm.containsKey(0))
//             {
//                 hm.put(n, hm.getOrDefault(n, 0) - 1);
//                 if(hm.get(0)==0)
//                     hm.remove(0);
//                 c++;
//                 System.out.println(n + " : "+(0));
//             }
//             else
//                 hm.put(n, hm.getOrDefault(n, 0) + 1);
//         }

//         System.out.println(c);
//         return c==arr.length/2;
//     }
// }

// class Solution {
//     public boolean canArrange(int[] arr, int k) {
//         Map<Integer, Integer>hm=new HashMap<>();
//         int c=0;
//         for(int x : arr)
//         {
//             hm.put(((x%k)+k)%k, hm.getOrDefault(((x%k)+k)%k, 0)+1);
//         }
//         for(int n : hm.keySet())
//         {
//             if()
//             if(hm.containsKey(k-n))
//                 c++;
//         }
//         System.out.println(c);
//         return c==arr.length/2;
//     }
// }

class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] frequency = new int[k];
        for(int num : arr){
            num %= k;
            if(num < 0) num += k;
            frequency[num]++;
        }
        if(frequency[0]%2 != 0) return false;
        
        for(int i = 1; i <= k/2; i++)
            if(frequency[i] != frequency[k-i]) return false;
			
        return true;
    }
}
// @lc code=end

