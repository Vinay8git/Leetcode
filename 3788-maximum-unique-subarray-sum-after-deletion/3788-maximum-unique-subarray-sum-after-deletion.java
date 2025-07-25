class Solution {
    public int maxSum(int[] nums) {
        // Map<Integer, Integer>hm=new HashMap<>();
        // int sum=0, max=Integer.MIN_VALUE;
        // for(int n : nums)
        // {
        //     hm.put(n, hm.getOrDefault(n, 0)+1);
        // }
        // for(int n : hm.keySet())
        // {
        //     if(n>0)
        //         sum+=n;
        //     else
        //         max=Math.max(max, n);
        // }
        // return sum==0?max:sum;

        Set<Integer>hm=new HashSet<>();
        int sum=0, max=Integer.MIN_VALUE;
        for(int n : nums)
            hm.add(n);
        for(int n : hm)
        {
            if(n>0)
                sum+=n;
            else
                max=Math.max(max, n);
        }
        return sum==0?max:sum;
    }
}