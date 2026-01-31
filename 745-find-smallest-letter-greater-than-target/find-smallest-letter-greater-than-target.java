// class Solution {
//     public char nextGreatestLetter(char[] letters, char target) {
//         Arrays.sort(letters);
//         for(char c : letters)
//         {
//             if(c>target) return c;
//         }
//         return letters[0];
//     }
// }

class Solution {
    public char nextGreatestLetter(char[] letters, char target) 
    {
        char ans='|';
        for(char c : letters)
        {
            if(c<ans && c>target)
            {
                ans = c;
            }
        }
        return ans=='|'? letters[0] : ans;
    }
}