// class Solution {
//     public void sortColors(int[] nums) 
//     {
//         int flag=0,t;
//         for(int i=0;i<nums.length;i++)
//         {
//             for(int j=0;j<nums.length-i-1;j++)
//             {
//                 if(nums[j]>nums[j+1])
//                 {
//                     flag=1;
//                     t=nums[j]; 
//                     nums[j]=nums[j+1];
//                     nums[j+1]=t;
//                 }
//             }
//             if(flag==0)
//                 return;
//         }
//         return;
//     }
// }


// class Solution {
//     public void sortColors(int[] nums) 
//     {
//         Map<Integer, Integer>hm=new HashMap<>();
//         for(int n : nums)
//             hm.put(n, hm.getOrDefault(n, 0) + 1);
//         int i=0;
//         for(int n : hm.keySet())
//         {
//             while(hm.get(n)>0)
//             {
//                 nums[i++]=n;
//                 hm.put(n, hm.get(n) - 1);
//             }
//         }
//         return;
//     }
// }

// class Solution {
// public void sortColors(int[] nums) 
// {
//         int l=0, m=0, r=nums.length-1,t;
//         while(m<=r)
//         {
//             switch(nums[m])
//             {
//                 case 0:
//                     t=nums[l];
//                     nums[l]=nums[m];
//                     nums[m]=t;
//                     l++;
//                     m++;
//                     break;
//                 case 1:
//                     m++;
//                     break;
//                 case 2:
//                     t=nums[m];
//                     nums[m]=nums[r];
//                     nums[r]=t;
//                     r--;
//             }
//         }
//     }
// }


class Solution
{
    private void quickSort(int[] nums, int l, int h)
    {
        if(l<h)
        {
            int mid = partition(nums, l, h);
            quickSort(nums, l, mid-1);
            quickSort(nums, mid+1, h);
        }
        return;
    }
    private int partition(int[] nums, int l, int h)
    {
        int pivot = nums[h];
        int i=l-1;
        for(int j=l; j<h;j++)
        {
            if(nums[j] <= pivot)
            {
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i+1, h);
        return i+1;
    }
    private void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return;
    }
    public void sortColors(int[] nums) 
    {
        quickSort(nums, 0, nums.length-1);
        // return nums;
    }
}