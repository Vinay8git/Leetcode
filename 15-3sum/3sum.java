// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> all = new ArrayList<>();
//         Arrays.sort(nums);
//         for (int i = 0; i < nums.length - 2; i++) {
//             for (int j = i + 1; j < nums.length - 1; j++) {
//                 for (int k = j + 1; k < nums.length; k++) {
//                     if (nums[i] + nums[j] + nums[k] == 0) {
//                         List<Integer> triplet = new ArrayList<>();
//                         triplet.add(nums[i]);
//                         triplet.add(nums[j]);
//                         triplet.add(nums[k]);

//                         if (!all.contains(triplet)) {
//                             all.add(triplet);
//                         }
//                     }
//                 }
//             }
//         }
//         return all;
//     }
// }

// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) 
//     {
//         Set<List<Integer>> st = new HashSet();

//         for(int i=0 ;i<nums.length-2; i++)
//         {
//             int num1 = nums[i];
//             Set<Integer> stAll = new HashSet();
//             for(int j = i+1 ; j<nums.length; j++){
//                 int num2 = nums[j];
             
//                 int numCheck = 0 - (num1 + num2);

//                 if(stAll.contains(numCheck))
//                 {
//                     int[] arr= {num1,num2,numCheck};
//                     Arrays.sort(arr);
//                     st.add(Arrays.asList(arr[0],arr[1],arr[2]));
//                 }
//                 else stAll.add(num2);

//             }
//         }
//         return new ArrayList(st);
//     }
    
// }



class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        List<List<Integer>> ans = new ArrayList<>();
            
        int n = nums.length;
        
        // Sort the input array nums
        Arrays.sort(nums);
        
        // Iterate through the array to find triplets
        for (int i = 0; i < n; i++) {
            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            // Two pointers approach
            int j = i + 1;
            int k = n - 1;
            
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    // Found a triplet that sums up to target
                    // List<Integer> temp = new ArrayList<>();
                    // temp.add(nums[i]);
                    // temp.add(nums[j]);
                    // temp.add(nums[k]);
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    
                    // Skip duplicates
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }
        
        return ans;
    }
}