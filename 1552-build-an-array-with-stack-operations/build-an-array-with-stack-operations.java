class Solution {
    public List<String> buildArray(int[] target, int n) {
        Set<Integer> st = new HashSet<>();
        List<String> al = new ArrayList<>();
        for(int t:target) st.add(t);
        int l = target.length;

        for(int i=1;i<=target[l-1];i++)
        {
            if(st.contains(i))
                al.add("Push");
            else
            {
                al.add("Push");
                al.add("Pop");
            }
        }
        return al;
    }
}