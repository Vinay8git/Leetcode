class Solution 
{
    public String addBinary(String a, String b) 
    {
        int i=a.length()-1, j=b.length()-1, carry=0;
        String res="";
        while(i>=0 && j>=0)
        {
            if(a.charAt(i)=='1' && b.charAt(j)=='1')
            {
                if(carry==1) res='1'+res;
                else res='0'+res;

                carry=1;
            }
            else if(a.charAt(i)=='1' && b.charAt(j)=='0' || a.charAt(i)=='0' && b.charAt(j)=='1')
            {
                if(carry==1){
                    res='0'+res;
                    carry=1;
                }
                else res='1'+res;
            }
            else{
                if(carry==1) {
                    res='1'+res;
                    carry=0;
                }
                else res='0'+res;
            }
            i--;
            j--;
            System.out.println(res);
        }
        while(i>=0)
        {
            if(a.charAt(i)=='1')
            {
                if(carry == 1) 
                {
                    res='0'+res;
                    carry=1;
                }
                else res='1'+res;
                
            }
            else
            {
                if(carry==1){
                    res='1'+res;
                    carry=0;
                }
                else res='0'+res;
            }
            i--;
        }
        while(j>=0)
        {
            if(b.charAt(j)=='1')
            {
                if(carry == 1) 
                {
                    res='0'+res;
                    carry=1;
                }
                else res='1'+res;
                
            }
            else
            {
                if(carry==1){
                    res='1'+res;
                    carry=0;
                }
                else res='0'+res;
            }
            j--;
        }
        return carry==1?'1'+res:res;
    }
}