/*
 * @lc app=leetcode id=921 lang=java
 *
 * [921] Minimum Add to Make Parentheses Valid
 */

// @lc code=start
class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character>st =new Stack<>();
        for(char ch : s.toCharArray())
        {
            if(ch==')' && !st.isEmpty() && st.peek()=='(')
                st.pop();
            else
                st.push(ch);
        }
        return st.size();
    }
}
// @lc code=end

