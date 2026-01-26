class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(arr);

        //Check Min Difference
        int dif = Integer.MAX_VALUE, n=arr.length;
        for(int i=1;i<n;i++)
        {
            dif = Math.min(dif, arr[i]-arr[i-1]);
        }

        //
        for(int i=1;i<n;i++)
        {
            if(arr[i]-arr[i-1] == dif)
            {
                List<Integer> al = new ArrayList<>();
                al.add(arr[i-1]);
                al.add(arr[i]);
                ans.add(al);
            }
        }
        return ans;
    }
}