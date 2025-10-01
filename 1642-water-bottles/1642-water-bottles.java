class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int db=0,emp=numBottles,exc=0,sum=emp;
        while(emp>=numExchange)
        {
            exc=emp/numExchange;
            db=emp%numExchange;
            sum+=exc;
            emp=db+exc;
        }
        return sum;
    }
}