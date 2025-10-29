// class Solution {
//     private boolean checkBits(int n)
//     {
//         while(n>0)
//         {
//             if((n&1)==0) return false;
//             n>>=1;
//         }
//         return true;
//     }
//     public int smallestNumber(int n) {
//         for(int i=n;;i++)
//         {
//             if(checkBits(i))
//                 return i;
//         }
//     }
// }



class Solution {
    public int smallestNumber(int n) {
        if (n <= 1) return 1;
        // n--;                     // handle exact powers
        n |= n >> 1;
        n |= n >> 2;
        n |= n >> 4;
        n |= n >> 8;
        n |= n >> 16;
        return n;
    }
}