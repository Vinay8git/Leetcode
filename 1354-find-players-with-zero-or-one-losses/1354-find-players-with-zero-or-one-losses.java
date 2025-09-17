class Solution {
    public List<List<Integer>> findWinners(int[][] matches) 
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        Set<Integer> st=new HashSet<>();
        List<List<Integer>> al=new ArrayList<>();
        List<Integer> aux1=new ArrayList<>();
        List<Integer> aux2=new ArrayList<>();
        for(int i=0;i<matches.length;i++)
        {
            hm.put(matches[i][1],hm.getOrDefault(matches[i][1],0)+1);
            st.add(matches[i][1]);
            st.add(matches[i][0]);
        }
        for(int val:st)
        {
            if(!hm.containsKey(val))
               aux1.add(val);
        
            if(hm.containsKey(val) && hm.get(val)==1)
               aux2.add(val);
        }
        Collections.sort(aux1);
        Collections.sort(aux2);
        al.add(aux1);
        al.add(aux2);

        return al;
    }
}