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
class Solution2 {
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


//Two Loops
class Solution3 {
    public int removeDuplicates(int[] nums) 
    {
        int prev = nums[0];
        int n = nums.length,k=1;
        for(int i=0;i<n;i++)
        {
            
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]!=nums[j])
                {
                    nums[k++]=nums[j];
                    i=j-1;
                    break;
                }
            }
        }
        
        return k;  
    }
}


//Two Pointer
class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int j=1, n=nums.length;
        for(int i=1;i<n;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[j]=nums[i];
                j++;
            }
        }
        
        return j;  
    }
}