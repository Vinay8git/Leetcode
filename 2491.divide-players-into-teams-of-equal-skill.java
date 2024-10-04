/*
 * @lc app=leetcode id=2491 lang=java
 *
 * [2491] Divide Players Into Teams of Equal Skill
 */

// @lc code=start
class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int i=0, j=skill.length-1;
        int avgskill = skill[0]+skill[j];
        long chem=0;
        while(i<j)
        {
            if((skill[i]+skill[j]) != avgskill)
                return -1;
            
            chem+=(skill[i]*skill[j]);
            i++;
            j--;
        }
        return chem;
    }
}
// @lc code=end

