class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {

        Integer[] cap = Arrays.stream(capacity).boxed().toArray(Integer[]::new);
        Arrays.sort(cap, (a, b) -> b - a);

        int totalApp = 0;
        for (int a : apple) totalApp += a;

        int count = 0;

        for (int c : cap) 
        {
            totalApp -= c;
            count++;
            if (totalApp <= 0) return count;
        }

        return count;
    }
}
