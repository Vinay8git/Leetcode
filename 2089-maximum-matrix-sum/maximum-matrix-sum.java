class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        long sum=0, count=0, m=matrix.length, n=matrix[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j] < 0)
                    count++;
                sum+=Math.abs(matrix[i][j]);
                min=Math.min(min, Math.abs(matrix[i][j]));
            }
        }
        if(count%2 == 0) return sum;
        else
            // System.out.println(sum);
            // System.out.println(min);
            sum=sum-Math.abs(min);
            sum=sum-Math.abs(min);
            return sum;
    }
}