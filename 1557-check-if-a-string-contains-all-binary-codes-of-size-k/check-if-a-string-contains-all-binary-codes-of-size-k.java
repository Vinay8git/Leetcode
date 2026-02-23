class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> st = new HashSet<>();
        for(int i=0;i<s.length()-k+1;i++)
        {
            String sub = s.substring(i,i+k);
            st.add(sub);
        }
        // System.out.println(st);
        int allNum = (int)Math.pow(2,k);
        return allNum == st.size();
    }
}