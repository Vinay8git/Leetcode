class Solution {
    public void reverse(int[] arr) 
    {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move pointers inward
            start++;
            end--;
        }
    }
    public List<Integer> minSubsequence(int[] nums) 
    {
        if(nums.length==1) return new ArrayList<>(Arrays.asList(nums[0]));
        List<Integer> al = new ArrayList<>();
        if(nums.length==2)
        {
            if(nums[0] == nums[1])
                return new ArrayList<>(Arrays.asList(nums[0], nums[1]));
            else
            {
                int max = Math.max(nums[0], nums[1]);
                return new ArrayList<>(Arrays.asList(max));
            }
        }
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            nums[i]=nums[i]+nums[i-1];
        }
        reverse(nums);
        System.out.println(Arrays.toString(nums));
        al.add(nums[0]-nums[1]);
        if(nums[0]-nums[1]> nums[1])
        {
            return al;
        }

        for(int i=1;i<nums.length-1;i++)
        {
            // al.add(nums[i-1]-nums[i+1]);
            if(nums[0]-nums[i+1] > nums[i+1])
            {
                al.add(nums[i]-nums[i+1]);
                // return al;
                break;
            }
            else
                al.add(nums[i]-nums[i+1]);
        }
        System.out.println(al);
        // al.remove(al.size()-1);
        System.out.println(al);

        return al;     
    }
}