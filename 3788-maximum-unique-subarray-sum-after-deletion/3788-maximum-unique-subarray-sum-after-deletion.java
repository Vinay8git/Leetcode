class Solution1 {

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

        Set<Integer> hm = new HashSet<>();
        int sum = 0, max = Integer.MIN_VALUE;
        for (int n : nums) hm.add(n);
        for (int n : hm) {
            if (n > 0) sum += n; else max = Math.max(max, n); // If All Numbers are Negative : Select only Largest Negative Number.
        }
        return sum == 0 ? max : sum;
    }
}

class Solution {

    public int maxSum(int[] nums) {
        Set<Integer> positiveNumsSet = new HashSet<>();
        for (int num : nums) {
            if (num > 0) {
                positiveNumsSet.add(num);
            }
        }
        if (positiveNumsSet.isEmpty()) {
            return Arrays.stream(nums).max().getAsInt();
        }
        return positiveNumsSet.stream().mapToInt(Integer::intValue).sum();
    }
}
