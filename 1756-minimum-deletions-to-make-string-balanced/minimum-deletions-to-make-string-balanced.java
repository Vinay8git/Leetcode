// class Solution {
//     public int countAs(String s, int i)
//     {
//         int count=0;
//         for(int j=i;j<s.length();j++)
//         {
//             if(s.charAt(j) == 'a')
//                 count++;
//         }
//         return count;
//     }
//     public int countDeletions(String s, int i)
//     {
//         if(i>=s.length()) return 0;

//         if(s.charAt(i) == 'b')
//         {
//             int deleteB = 1+countDeletions(s, i+1);
//             int skipB = countAs(s, i+1);
//             return Math.min(deleteB, skipB);
//         }
//         else
//             return countDeletions(s, i+1);
//     }
//     public int minimumDeletions(String s) {
//         return countDeletions(s, 0);
//     }
// }



class Solution {
    Map<Integer, Integer> hm = new HashMap<>();
    public int[] preProcessAs(String s)
    {
        int nums[] = new int[s.length()];
        if(s.charAt(s.length()-1) == 'a') nums[s.length()-1] = 1;
        for(int j=s.length()-2;j>=0;j--)
        {
            if(s.charAt(j) == 'a')
                nums[j]=nums[j+1]+1;
            else nums[j]=nums[j+1];
        }
        return nums;
    }
    public int countDeletions(String s, int i, int[] nums)
    {
        if(hm.containsKey(i)) return hm.get(i);
        if(i>=s.length()) return 0;

        if(s.charAt(i) == 'b')
        {
            int deleteB = 1+countDeletions(s, i+1, nums);
            int skipB = i==s.length()-1? 0 : nums[i+1];
            hm.put(i, Math.min(deleteB, skipB));
            return hm.get(i);
        }
        else
        {
            hm.put(i, countDeletions(s, i+1, nums));
            return hm.get(i);
        }
    }
    public int minimumDeletions(String s) {
        int nums[] = preProcessAs(s);
        return countDeletions(s, 0, nums);
    }
}