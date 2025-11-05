class Solution1 {
    public String largestMerge(String word1, String word2) {

        String s="";
        int i=0, j=0;
        while(i<word1.length() && j<word2.length())
        {
            if(word1.charAt(i)==word2.charAt(j))
            {
                if (word1.substring(i).compareTo(word2.substring(j)) > 0) 
                {
                    s+=word1.charAt(i);
                    i++;
                
                }
                else 
                {
                    s+=word2.charAt(j);
                    j++;
                }

            }
            else if(word1.charAt(i)>word2.charAt(j))
            {
                s+=word1.charAt(i);
                i++;
            }
            else
            {
                s+=word2.charAt(j);
                j++;
            }
        }
        while(i<word1.length())
        {
            s+=word1.charAt(i);
            i++;
        }
        while(j<word2.length())
        {
            s+=word2.charAt(j);
            j++;
        }

        return s;
    }
}

class Solution {
    public String largestMerge(String word1, String word2) {

        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();

        while (i < word1.length() && j < word2.length()) {

            // Compare remaining suffixes
            if (word1.substring(i).compareTo(word2.substring(j)) > 0) {
                sb.append(word1.charAt(i));
                i++;
            } else {
                sb.append(word2.charAt(j));
                j++;
            }
        }

        // Append remaining tail
        if (i < word1.length()) sb.append(word1.substring(i));
        if (j < word2.length()) sb.append(word2.substring(j));

        return sb.toString();
    }
}
