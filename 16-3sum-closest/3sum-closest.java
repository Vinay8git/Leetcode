class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum=0, min=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    sum=nums[i]+nums[j]+nums[k];
                    if(Math.abs(sum-target) < Math.abs(min-target))
                        min=sum;
                }
            }
        }
        return min;
    }
}



// class Solution {
//     public int threeSumClosest(int[] nums, int target) {
//         Arrays.sort(nums);
//         int closestSum = nums[0] + nums[1] + nums[2]; // Initialize with the first possible sum
        
//         for (int i = 0; i < nums.length - 2; i++) 
//         {
//             int left = i + 1;
//             int right = nums.length - 1;
            
//             while (left < right) 
//             {
//                 int currentSum = nums[i] + nums[left] + nums[right];
                
//                 // If the current sum is closer to the target, update the closest sum
//                 if(Math.abs(currentSum - target) < Math.abs(closestSum - target))
//                     closestSum = currentSum;
                
//                 if(currentSum < target)
//                     left++; // Try to increase the sum by moving the left pointer
//                 else if (currentSum > target)
//                     right--; // Try to decrease the sum by moving the right pointer
//                 else
//                     return closestSum; // If the sum exactly matches the target, return it
//             }
//         }
        
//         return closestSum;
//     }
// }