class Solution {
    public int totalMoney(int n) {
        int cur=1, total=0, day=0;
        while(n>0)
        {
            day++;
            if(day==8)
            {
                day=1;
                cur=cur-7+1;
            }
            total+=cur;
            cur++;
            
            n--;
        }
        return total;
    }
}