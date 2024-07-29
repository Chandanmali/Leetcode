class Solution {
    public int sumOfUnique(int[] nums) 
    {
        int sum = 0;
       
        for(int i = 0; i < nums.length; i++)
        {
            int f = 0;
            for(int j = 0; j < nums.length; j++)
            {
                if(nums[i] == nums[j] && i != j)
                {
                    f = 1;
                    break;
                }
            }
            if(f == 0 ) 
            {
                sum = sum + nums[i]; //1 
            }
            

        }
        return sum;
    }
}