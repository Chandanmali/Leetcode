class Solution {
    public int diagonalSum(int[][] mat) 
    {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < mat.length; i++)
        {
            for(int j = 0; j < mat[i].length; j++)
            {
                if(i == j)
                {
                    sum1 = sum1 + mat[i][j];
                }

                else if(i + j == mat.length-1)
                {
                    sum2 = sum2 + mat[i][j];
                }
            }
           
        }
        int finalSum = sum1 + sum2;
        return finalSum;
    }
}