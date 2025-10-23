class Solution {
    public boolean hasSameDigits(String s) {
        String res;
        while(s.length()>2)
        {
            res="";
            for(int i=0;i<s.length()-1;i++)
            {
                int a=s.charAt(i)-'0';
                int b=(int)s.charAt(i+1)-'0';
                int sum = (a+b)%10;
                res = res+(Integer.toString(sum));
            }
            s=res;
        }
        return s.charAt(0)==s.charAt(1);
    }
}