class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>(numRows);
        List<Integer> row=new ArrayList<>();

        row.add(1);
        res.add(row);
        if(numRows==1)
            return res;

        row=new ArrayList<>();
        row.add(1);
        row.add(1);
        res.add(row);
        if(numRows==2)
            return res;

        // System.out.println(res);
        for(int i=2;i<numRows;i++)
        {
            row=new ArrayList<>();
            for(int j=0;j<res.get(i-1).size();j++)
            {
                if(j==0) 
                    row.add(1);

                else if(j>0)
                    row.add(res.get(i-1).get(j)+res.get(i-1).get(j-1));
                
                if(j==res.get(i-1).size()-1)
                    row.add(1);
            }
            res.add(row);
        }
        return res;
    }
}