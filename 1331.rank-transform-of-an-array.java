/*
 * @lc app=leetcode id=1331 lang=java
 *
 * [1331] Rank Transform of an Array
 */

// @lc code=start
//TLE

// class Solution {
//     public int[] arrayRankTransform(int[] arr) {
//         Set<Integer>al=new TreeSet<>();
//         int[] res=new int[arr.length];

//         for(int n : arr)
//             al.add(n);

//         int k=1, rank=1;
//         for(int i=0;i<arr.length;i++)
//         {
//             k=1;
//             for(int n : al)
//             {
//                 if(n==arr[i])
//                 {
//                     rank=k;
//                     break;
//                 }
//                 k++;
//             }
//             res[i]=rank;
//         }
//         return res;
//     }
// }

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer>hm=new HashMap<>();
        Set<Integer>al=new TreeSet<>();
        int[] res=new int[arr.length];

        for(int n : arr)
            al.add(n);


        int k=1, rank=1;
        for(int n : al)
        {
            hm.put(n, k);
            k++;
        }

        for(int i=0;i<arr.length;i++)
        {
            res[i]=hm.get(arr[i]);
        }
        return res;
    }
}
// @lc code=end

