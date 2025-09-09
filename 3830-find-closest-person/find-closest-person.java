class Solution {
    public int findClosest(int x, int y, int z) {
        return Math.abs(z-x)<=Math.abs(y-z)?Math.abs(z-x)==Math.abs(y-z)?0:1:2;
    }
}