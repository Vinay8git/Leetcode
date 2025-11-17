class Solution1 {
    public boolean kLengthApart(int[] nums, int k) {
        int n = nums.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i] == 1 && nums[j] == 1)
                    if((j-i-1) < k) return false;
            
            }
        }
        return true;
    }
}



class Solution2 {
    public boolean kLengthApart(int[] nums, int k) {
        int n = nums.length;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i] == 0) continue;
            for(int j=i+1;j<n;j++)
            {
                if(nums[j] == 1)
                    if((j-i-1) < k) return false;
            
            }
        }
        return true;
    }
}



class Solution3 {
    public boolean kLengthApart(int[] nums, int k) {
        int n = nums.length;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i] == 1)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(nums[j] == 1 && (j-i-1) < k) return false;
                        
                }
            }
        }
        return true;
    }
}




class Solution4 {
    public boolean kLengthApart(int[] nums, int k) {
        int n = nums.length;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i] == 1)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(nums[j] == 1)
                    {
                        if((j-i-1) < k) return false;
                        else break;
                    }
                        
                }
            }
        }
        return true;
    }
}




class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n = nums.length;
        int s=0, e=0;

        while(s<n && nums[s] != 1) 
            s++;

        e=s+1;
        if(e>=n) return true;

        while(e<n)
        {
            if(nums[e] == 1)
            {
                if((e-s-1) < k) return false;
                else s=e;
            }
            e++;
        }
        return true;
    }
}