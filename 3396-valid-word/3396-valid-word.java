class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;
        int vw=0, cn=0;
        for(int i=0;i<word.length();i++)
        {
            char wd=Character.toUpperCase(word.charAt(i));
            if(wd == 'A' || wd == 'E' || wd == 'I' || wd == 'O' || wd == 'U')
                vw=1;
            else if(wd>='A' && wd<='Z')
                cn=1;
            else if(wd>='0' && wd<='9')
                continue;
            else
                return false;
        }
        if(vw==1 && cn==1)
            return true;
        return false;
    }
}