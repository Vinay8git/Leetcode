class Solution {
    public int maxFreqSum(String s) {
        int[] apbt=new int[26];
        int maxV=0, maxC=0;

        for(char c : s.toCharArray())
        {
            apbt[c-'a']++;
        }
        for(int i=0; i<26;i++)
        {
            char c = (char)(i+97);
            
            if(apbt[i]>0)
            {
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                    maxV=Math.max(maxV, apbt[i]);
                else
                    maxC=Math.max(maxC, apbt[i]);
            }
        }
        return maxV+maxC;
    }
}