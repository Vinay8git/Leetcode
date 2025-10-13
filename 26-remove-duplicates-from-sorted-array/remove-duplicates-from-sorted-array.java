//Set
class Solution1 {
    public int removeDuplicates(int[] nums) {
        Set<Integer> st = new LinkedHashSet<>() ;
        for(int n : nums)
            st.add(n);
        
        int i=0;
        for(int n : st)
        {
            nums[i++]=n;
        }
        return i;  
    }
}

//Array
class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> al = new ArrayList<>();
        int prev = nums[0];
        al.add(prev);
        for(int n : nums)
        {
            if(n!=prev)
            {
                prev=n;
                al.add(n);
            }
        }
        
        int i=0;
        for(int n : al)
        {
            nums[i++]=n;
        }
        return i;  
    }
}