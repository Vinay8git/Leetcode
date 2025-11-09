class Solution1 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> al = new ArrayList<>();
        int size = nums.length, val;
        for(int i=0;i<size;i++)
        {
            val = nums[i]>size?nums[i]-size:nums[i];

            if(nums[val-1] > size)
                al.add(val);

            else nums[val-1] = nums[val-1]+size;

        }
        return al;
    }
}


class Solution2 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> al = new ArrayList<>();
        int size = nums.length, val;
        for(int i=0;i<size;i++)
        {
            val = Math.abs(nums[i]);

            if(nums[val-1] < 0)
                al.add(val);

            else nums[val-1] = -nums[val-1];

        }
        return al;
    }
}


// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
//         List<Integer> al = new ArrayList<>();
//         int size = nums.length;
//         for(int i=0;i<size-1;i++)
//         {
//             for(int j=i+1;j<size;j++)
//             {
//                 if(nums[i]==nums[j])
//                 {
//                     al.add(nums[i]);
//                     break;
//                 }
//             }

//         }
//         return al;
//     }
// }




class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        List<Integer> al = new ArrayList<>();
        // int size = nums.length;
        for(int n : nums)
            hm.put(n, hm.getOrDefault(n,0)+1);

        for(int key : hm.keySet())
        {
            if(hm.get(key)==2)
                al.add(key);
        }

        return al;
    }
}