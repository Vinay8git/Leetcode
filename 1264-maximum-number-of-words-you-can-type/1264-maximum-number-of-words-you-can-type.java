class Solution {
    public int canBeTypedWords(String text, String bl) {
        List<String> al = new ArrayList<>();
        text=text+" ";

        String wd="";

        for(int i=0;i<text.length();i++)
        {
            if(text.charAt(i) == ' ')
            {
                al.add(wd);
                wd="";
                continue;
            }
            wd+=text.charAt(i);
        }

        int flag=0, count=0;
        for(String word : al)
        {
            flag=0;
            for(int i=0;i<word.length();i++)
            {
                
                if(bl.contains(word.substring(i,i+1)))
                {
                    flag=1;
                    break;
                }
                
            }
            if(flag==0) count++;
        }
        return count;
    }
}