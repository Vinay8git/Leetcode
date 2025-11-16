class Solution {
    public int numSub(String st) {
        int n = st.length();
        int s=0, e=0;
        int count=0;
        int MOD = 1_000_000_007;
        while(e<n)
        {
            if(st.charAt(e) == '0')
            {
                s=e+1;
            }
            else
            {
                count=(count+e-s+1)%MOD;
            }
            e++;
        }
        return count%MOD;
    }
}





// class Solution {

//     public int numSub(String s) {
//         final int MODULO = 1000000007;
//         long total = 0;
//         int length = s.length();
//         long consecutive = 0;
//         for (int i = 0; i < length; i++) {
//             char c = s.charAt(i);
//             if (c == '0') {
//                 total += (consecutive * (consecutive + 1)) / 2;
//                 total %= MODULO;
//                 consecutive = 0;
//             } else {
//                 consecutive++;
//             }
//         }
//         total += (consecutive * (consecutive + 1)) / 2;
//         total %= MODULO;
//         return (int) total;
//     }
// }